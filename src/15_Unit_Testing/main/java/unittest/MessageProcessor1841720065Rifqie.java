package unittest;

public class MessageProcessor1841720065Rifqie {
    private String mSender;
    private String mRecipient;
    private String mMessage;

    public String getmSenderRifqie() {
        return mSender;
    }

    public void setmSenderRifqie(String mSender) {
        this.mSender = mSender;
    }

    public String getmRecipientRifqie() {
        return mRecipient;
    }

    public void setmRecipientRifqie(String mRecipient) {
        this.mRecipient = mRecipient;
    }

    public String getmMessageRifqie() {
        return mMessage;
    }

    public void setmMessageRifqie(String mMessage) {
        this.mMessage = mMessage;
    }

    public String messageFormatRifqie() {
        return String.format("Hai %s, you have message from %s.\nThe message as follows : %s",
                this.getmRecipientRifqie(), this.getmSenderRifqie(), this.getmMessageRifqie());
    }

    public void showMessageRifqie() {
        System.out.println(messageFormatRifqie());
    }
}
