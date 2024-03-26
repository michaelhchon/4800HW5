// Abstract class for Message
abstract class AbstractMessage {
    protected MessageSender messageSender;

    public AbstractMessage(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void send();
}

// Interface for message sender (Bridge)
interface MessageSender {
    void sendMessage(AbstractMessage message);
}

// Concrete implementation - WhatsApp
class WhatsAppMessagingApp implements MessageSender {
    @Override
    public void sendMessage(AbstractMessage message) {
        System.out.println("Sending message via WhatsApp");
        message.send();
    }
}

// Concrete implementation - Telegram
class TelegramMessagingApp implements MessageSender {
    @Override
    public void sendMessage(AbstractMessage message) {
        System.out.println("Sending message via Telegram");
        message.send();
    }
}

// Concrete implementation - Facebook Messenger
class FacebookMessagingApp implements MessageSender {
    @Override
    public void sendMessage(AbstractMessage message) {
        System.out.println("Sending message via Facebook Messenger");
        message.send();
    }
}

// Concrete implementation of text message
class TextMessage extends AbstractMessage {
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        System.out.println("Text sent");
    }
}

// Concrete implementation of image message
class ImageMessage extends AbstractMessage {
    public ImageMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        System.out.println("Image sent");
    }
}

// Concrete implementation of video message
class VideoMessage extends AbstractMessage {
    public VideoMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        System.out.println("Video sent");
    }
}