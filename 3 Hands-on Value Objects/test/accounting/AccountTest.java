package accounting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import valueObjects.Amount;

class AccountTest {

	@Test
	void testAccountConstruction() {

		Customer accountowner = new Customer("Carola", "Lilienthal", LocalDate.of(1967, 9, 11));
		Account account = new Account(accountowner);
		assertEquals(1, account.getAccountnumber().getAccountNumber());
		assertEquals(0, account.getBalance().getAmount());
		assertEquals(accountowner, account.getAccountowner());
	}

	@Test
	void testBalanceAccount() {
		Customer accountowner = new Customer("Carola", "Lilienthal", LocalDate.of(1967, 9, 11));
		Account account = new Account(accountowner);
		assertEquals(0, account.getBalance().getAmount());
		account.setBalance(Amount.of(100));
		assertEquals(100, account.getBalance().getAmount());

	}

}
