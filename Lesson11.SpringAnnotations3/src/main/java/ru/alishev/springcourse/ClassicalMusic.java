package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {
    List<String> playlist;

    public ClassicalMusic() {
        this.playlist = new ArrayList<>(3);
        playlist.add("Swan Lake");
        playlist.add("Rapsody of Blue");
        playlist.add("Aria Borisa Godunova");
    }

    @Override
    public String getSong() {

        Random random = new Random();

        String s = playlist.get(random.nextInt(playlist.size()));

        return s;
    }
}

