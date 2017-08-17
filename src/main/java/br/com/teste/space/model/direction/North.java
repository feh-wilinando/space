package br.com.teste.space.model.direction;

import br.com.teste.space.model.Position;

public class North implements Direction {
    @Override
    public Position getFoward(int x, int y) {
        return new Position(this, x, y+1);
    }

    @Override
    public Position getLeft(int x, int y) {
        return new Position(new West(),x,y);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().isAssignableFrom(this.getClass());
    }
}
