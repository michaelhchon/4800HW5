
public class AppDriver {

	public static void main(String[] args) {
		// Create apps
        MessageSender whatsApp = new WhatsAppMessagingApp();
        MessageSender telegram = new TelegramMessagingApp();
        MessageSender facebook = new FacebookMessagingApp();

        // Create different types of messages
        AbstractMessage textMessage = new TextMessage(whatsApp);
        AbstractMessage imageMessage = new ImageMessage(telegram);
        AbstractMessage videoMessage = new VideoMessage(facebook);

        // Send messages
        whatsApp.sendMessage(textMessage);
        whatsApp.sendMessage(imageMessage);
        whatsApp.sendMessage(videoMessage);
        telegram.sendMessage(textMessage);
        telegram.sendMessage(imageMessage);
        telegram.sendMessage(videoMessage);
        facebook.sendMessage(textMessage);
        facebook.sendMessage(imageMessage);
        facebook.sendMessage(videoMessage);
	}

}
