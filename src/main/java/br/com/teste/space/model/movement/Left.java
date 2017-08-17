package br.com.teste.space.model.movement;

import br.com.teste.space.model.Position;

public class Left implements Movement {

    @Override
    public Position move(Position position) {
        return position.getLeft();
    }


}
