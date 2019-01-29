package ai.bale.jbot.api.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PurchaseMessage extends Message {

    @JsonProperty("msg")
    private Message message;
    private String accountNumber;
    private String amount;
    private String regexAmount;
    private String moneyRequestType;

    public PurchaseMessage() {
        super("PurchaseMessage");
    }

    public PurchaseMessage(Message message, String accountNumber, String amount,
        String regexAmount, String moneyRequestType) {
        this();
        this.message = message;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.regexAmount = regexAmount;
        this.moneyRequestType = moneyRequestType;
    }

    public Message getMessage() {
        return message;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAmount() {
        return amount;
    }

    public String getRegexAmount() {
        return regexAmount;
    }

    public String getMoneyRequestType() {
        return moneyRequestType;
    }

    @Override
    public String toString() {
        return "PurchaseMessage{" +
            "message=" + message +
            ", accountNumber='" + accountNumber + '\'' +
            ", amount='" + amount + '\'' +
            ", regexAmount='" + regexAmount + '\'' +
            ", moneyRequestType='" + moneyRequestType + '\'' +
            '}';
    }
}
