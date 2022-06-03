public class Song {


    String tile;
    Double duration;

    public Song(String tile, Double duration) {
        this.tile = tile;
        this.duration = duration;
    }

    public Song() {
    }

    public String getTile() {
        return tile;
    }

    public Double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "tile='" + tile + '\'' +
                ", duration=" + duration +
                '}';
    }

}
