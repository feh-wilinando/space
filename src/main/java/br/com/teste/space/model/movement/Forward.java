package br.com.teste.space.model.movement;

import br.com.teste.space.model.Position;

public class Forward implements Movement {


    public Position move(Position position) {
        return position.getFoward();
    }


}
