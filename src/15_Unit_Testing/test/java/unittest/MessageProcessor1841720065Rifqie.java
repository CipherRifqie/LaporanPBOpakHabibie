package learnunittesting;

public class MessageProcessor1841720065Rifqie{
private String sender, recipient, message;

public String getMessageRifqie() { 
    return message;
}

public String getRecipientRifqie() { 
    return recipient;
}

public String getSenderRifqie() { 
    return sender;
}

public void setMessageRifqie(String message) { 
    this.message = message;
}

public void setRecipientRifqie(String recipient) { 
    this.recipient = recipient;
}

public void setSenderRifqie(String sender) { 
    this.sender = sender;
}

public String messageFormatRifqie(){
    String message = String.format("Hi. %s you have message from %s.\nThe message as follows : %s",
            this.recipient, this.sender, this.message);
    return message;
}
public void showMessageRifqie(){
    System.out.println(messageFormatRifqie());
}
}