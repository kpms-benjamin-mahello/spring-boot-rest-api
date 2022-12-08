package com.boxhitgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v-2/games")
public class Main {

    private final GameRepository gameRepository;

    public Main(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping
    public List<Game> getGames() {
        return gameRepository.findAll();
    }

    record NewGameRequest(
            String name
    ){

    }
    


    @PostMapping
    public void addCustomer(@RequestBody NewGameRequest request) {
        Game game = new Game();
        game.setName(request.name());
        gameRepository.save(game);

    }
}