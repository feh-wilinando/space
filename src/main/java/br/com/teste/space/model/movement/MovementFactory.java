package br.com.teste.space.model.movement;

public enum MovementFactory {
    FORWARD(new Forward()),
    LEFT(new Left());



    private final Movement movement;

    MovementFactory(Movement movement){
        this.movement = movement;
    }

    public Movement get() {
        return movement;
    }
}
