package br.com.teste.space.model.direction;

import br.com.teste.space.model.Position;

public class West implements Direction {

    public Position getFoward(int x, int y) {
        return new Position(this, x-1, y);
    }

    public Position getLeft(int x, int y){
        return new Position(new South(), x, y);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().isAssignableFrom(this.getClass());
    }
}
