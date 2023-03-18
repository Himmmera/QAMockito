public class Poster {

    private String title;
    private String id;
    private String imageurl;
    private int releaseYear;


    public Poster(String id, String title, int releaseYear, String imageurl) {

        this.title = title;
        this.id = id;
        this.imageurl = imageurl;
        this.releaseYear = releaseYear;
    }
}
