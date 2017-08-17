package br.com.teste.space.model.direction;

import br.com.teste.space.model.Position;

public class East implements Direction {
    @Override
    public Position getFoward(int x, int y) {
        return new Position(this, x+1, y);
    }

    @Override
    public Position getLeft(int x, int y) {
        return new Position(new North(), x,y);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().isAssignableFrom(this.getClass());
    }

}
