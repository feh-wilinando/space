package br.com.teste.space.model;

import br.com.teste.space.exceptions.IllegalMovementException;
import br.com.teste.space.model.movement.Movement;

public class SpaceProbe {
    private Position position;

    public SpaceProbe(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void move(Movement movement, final MarsPlateau plateau) {

        Position newPosition = movement.move(position);

        if ( !plateau.isValid(newPosition)) {
            throw new IllegalMovementException();
        }

        this.position = newPosition;

    }
}
