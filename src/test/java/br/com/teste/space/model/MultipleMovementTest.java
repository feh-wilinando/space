package br.com.teste.space.model;

import br.com.teste.space.exceptions.IllegalMovementException;
import br.com.teste.space.model.direction.East;
import br.com.teste.space.model.movement.MovementFactory;
import org.junit.Test;

public class MultipleMovementTest {

    @Test(expected = IllegalMovementException.class)
    public void shouldCollisionSpaceProbeAWhenMoveFoward(){

        MarsPlateau plateau = new MarsPlateau(10, 10);

        SpaceProbe spaceProbeA = new SpaceProbe(new Position(new East(), 0, 0));
        SpaceProbe spaceProbeB = new SpaceProbe(new Position(new East(), 1, 0));


        plateau.add(spaceProbeA);
        plateau.add(spaceProbeB);

        spaceProbeA.move(MovementFactory.FORWARD.get(), plateau);

    }

}
