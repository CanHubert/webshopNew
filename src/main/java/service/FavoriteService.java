package service;

import entity.Favorite;
import org.springframework.stereotype.Repository;
import repository.FavoriteRepository;

@Repository
public class FavoriteService {
    private final FavoriteRepository favoriteRepository;

    public FavoriteService(FavoriteRepository favoriteRepository) {
        this.favoriteRepository = favoriteRepository;
    }

    public Favorite saveFavorite(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }

    public void removeFavorite(Favorite favorite) {
        favoriteRepository.delete(favorite);
    }
}

