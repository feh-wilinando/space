package br.com.teste.space.model;

import br.com.teste.space.model.direction.*;
import br.com.teste.space.model.movement.Movement;
import br.com.teste.space.model.movement.MovementFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleMovementTest {

    private MarsPlateau plateau = new MarsPlateau(10, 10);

    @Test
    public void shouldMoveForwardFromWestSpaceProbe(){

        Direction west = new West();

        Position startPosition = new Position(west,0 ,0);

        SpaceProbe spaceProbe = new SpaceProbe(startPosition);

        Movement forward = MovementFactory.FORWARD.get();

        spaceProbe.move(forward, plateau);

        assertEquals(new Position(west, -1, 0), spaceProbe.getPosition() );

    }


    @Test
    public void shouldMoveForwardFromEastSpaceProbe(){

        Direction east = new East();

        Position startPosition = new Position(east,0 ,0);

        SpaceProbe spaceProbe = new SpaceProbe(startPosition);

        Movement forward = MovementFactory.FORWARD.get();

        spaceProbe.move(forward, plateau);

        assertEquals(new Position(east, 1, 0), spaceProbe.getPosition() );

    }



    @Test
    public void shouldMoveForwardFromNorthSpaceProbe(){

        Direction north = new North();

        Position startPosition = new Position(north,0 ,0);

        SpaceProbe spaceProbe = new SpaceProbe(startPosition);

        Movement forward = MovementFactory.FORWARD.get();

        spaceProbe.move(forward, plateau);

        assertEquals(new Position(north, 0, 1), spaceProbe.getPosition() );

    }


    @Test
    public void shouldMoveForwardFromSouthSpaceProbe(){

        Direction south = new South();

        Position startPosition = new Position(south,0 ,0);

        SpaceProbe spaceProbe = new SpaceProbe(startPosition);

        Movement forward = MovementFactory.FORWARD.get();

        spaceProbe.move(forward, plateau);

        assertEquals(new Position(south, 0, -1), spaceProbe.getPosition() );

    }



    @Test
    public void shouldRotateLeftFromWestSpaceProbe(){

        Direction west = new West();

        Position startPosition = new Position(west,0 ,0);

        SpaceProbe spaceProbe = new SpaceProbe(startPosition);

        Movement left = MovementFactory.LEFT.get();

        spaceProbe.move(left, plateau);

        assertEquals(new Position(new South(), 0, 0), spaceProbe.getPosition() );

    }


    @Test
    public void shouldRotateLeftFromEastSpaceProbe(){

        Direction east = new East();

        Position startPosition = new Position(east,0 ,0);

        SpaceProbe spaceProbe = new SpaceProbe(startPosition);

        Movement left = MovementFactory.LEFT.get();

        spaceProbe.move(left, plateau);

        assertEquals(new Position(new North(), 0, 0), spaceProbe.getPosition() );

    }


    @Test
    public void shouldRotateLeftFromNorthSpaceProbe(){

        Direction north = new North();

        Position startPosition = new Position(north,0 ,0);

        SpaceProbe spaceProbe = new SpaceProbe(startPosition);

        Movement left = MovementFactory.LEFT.get();

        spaceProbe.move(left, plateau);

        assertEquals(new Position(new West(), 0, 0), spaceProbe.getPosition() );

    }


    @Test
    public void shouldRotateLeftFromSouthSpaceProbe(){

        Direction south = new South();

        Position startPosition = new Position(south,0 ,0);

        SpaceProbe spaceProbe = new SpaceProbe(startPosition);

        Movement left = MovementFactory.LEFT.get();

        spaceProbe.move(left, plateau);

        assertEquals(new Position(new East(), 0, 0), spaceProbe.getPosition() );

    }


    //TODO: Rotate Right And Factory for Direction

}
