package br.com.teste.space.model.direction;

import br.com.teste.space.model.Position;

public interface Direction {
    Position getFoward(int x, int y);

    Position getLeft(int x, int y);
}
