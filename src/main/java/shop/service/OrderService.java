package shop.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import shop.ItemNotFound;
import shop.dto.OrderDto;
import shop.entity.Address;
import shop.entity.Cart;
import shop.entity.Order;
import shop.entity.User;
import shop.repository.AddressRepository;
import shop.repository.CartRepository;
import shop.repository.OrderRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final AddressRepository addressRepository;
    private final OrderRepository orderRepository;
    private final CartRepository cartRepository;

    public Order createOrder(OrderDto orderDto, User user, Address address, Cart cart) {
        Order order = new Order();
        Address orderAddress = saveAddress(orderDto, address, user);
        order.setAddress(orderAddress);
        cart.setActive(false);

        order.setCart(saveCart(cart));
        return orderRepository.save(order);
    }

    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Address saveAddress(OrderDto orderDto, Address address, User user) {
        if(address.getId() != null) {
            address = addressRepository.findById(address.getId()).get();
        }
        Address addressToSave = Boolean.parseBoolean(orderDto.updateAddress()) ? address : new Address();
        addressToSave.setUser(user);
        addressToSave.setAddressName(orderDto.addressName());
        addressToSave.setAddress(orderDto.address());
        addressToSave.setCountry(orderDto.country());
        addressToSave.setCity(orderDto.city());
        addressToSave.setPostalCode(orderDto.postalCode().replace("-", ""));
        return addressToSave.compareFields(address) ? address : addressToSave;
    }

    public Page<Order> getAllProducts(Pageable pageable) {
        return orderRepository.findAll(pageable);
    }

    public Order findById(Long id) {
        Optional<Order> byId = orderRepository.findById(id);
        return byId.orElseThrow(() -> new ItemNotFound("Order", id));
    }
}
