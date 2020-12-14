package ui.resources;

public class Message {

    public Message(String recipient, String messageSubject, String messageText) {
        this.recipient = recipient;
        this.messageSubject = messageSubject;
        this.messageText = messageText;
    }

    public String recipient;

    public String messageSubject;

    public String messageText;
}
