package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.FavoriteRepository;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {
    private final FavoriteRepository favoriteRepository;

    public FavoriteController(FavoriteRepository favoriteRepository) {
        this.favoriteRepository = favoriteRepository;
    }

    @PostMapping("/{userId}/{productId}")
    public ResponseEntity<String> addToFavorites(
            @PathVariable Long userId, @PathVariable Long productId) {
        // Implementacja dodawania do ulubionych
        // Pobierz użytkownika i produkt na podstawie ID, a następnie utwórz Favorite i zapisz go w bazie danych
        return ResponseEntity.ok("Added to favorites");
    }

    // Implementuj inne metody kontrolera dla usuwania z ulubionych itp.
}