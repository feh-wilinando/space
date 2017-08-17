package br.com.teste.space.model;

import br.com.teste.space.model.direction.Direction;

public class Position {

    private final Direction direction;
    private final int x;
    private final int y;

    public Position(Direction direction, int x, int y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public Position getFoward() {
        return direction.getFoward(x,y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (x != position.x) return false;
        if (y != position.y) return false;
        return direction.equals(position.direction);
    }

    @Override
    public int hashCode() {
        int result = direction.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }

    public Position getLeft() {
        return direction.getLeft(x, y);
    }

    public boolean collision(Position position) {
        return false;
    }
}
