package br.com.teste.space.model;

import java.util.HashSet;
import java.util.Set;

public class MarsPlateau {
    private final int width;
    private final int height;
    private Set<SpaceProbe> spaceProbes = new HashSet<>();

    public MarsPlateau(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void add(SpaceProbe spaceProbe) {
        if (!spaceProbes.add(spaceProbe)) {
            //TODO: possition Invalid Exception
        }
    }

    public boolean isValid(Position newPosition) {
        boolean nonOverlap = spaceProbes.stream().map(SpaceProbe::getPosition).noneMatch(position -> position.collision(newPosition));

        return nonOverlap && inLimits(newPosition);
    }

    private boolean inLimits(Position newPosition) {
        return newPosition.getX() <= width && newPosition.getY() <= height;
    }
}
