package sample.multimodule.service.api;

import sample.multimodule.domain.entity.Personne;

public interface PersonneService {

    /**
     * Finds the account with the provided account number.
     * 
     * @param number The account number
     * @return The account
     * @throws AccountNotFoundException If no such account exists.
     */
    Personne findOne(String number) ;

    /**
     * Creates a new account.
     * 
     * @param number
     * @return created account
     */
    Personne createAccountByNumber(String number);
}
