package app;

import java.io.Serializable;

public class Feedback implements Serializable {
    private int rating;
    private String response;

    public Feedback(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Feedback [Rating: " + rating + ", Response: " + response + "]";
    }
}
