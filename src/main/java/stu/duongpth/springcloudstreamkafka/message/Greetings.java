package stu.duongpth.springcloudstreamkafka.message;

public class Greetings {
    private long timestamp;
    private String message;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Greetings() {
    }

    public Greetings(long timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    public Greetings(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Greetings{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                '}';
    }

    public String builder() {
        return "{" +
                "\"timestamp\":\"" + timestamp +
                "\", \"message\":\"" + message + '\"' +
                '}';
    }
}
