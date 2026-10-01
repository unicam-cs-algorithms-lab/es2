package it.unicam.cs.asdl.es2;

/**
 * Modella uno scassinatore che cerca la combinazione di una
 * {@link CombinationLock} mediante forza bruta.
 * <p>
 * Lo scassinatore lavora sulla stessa cassaforte ricevuta al momento della
 * costruzione e deve interagire con essa esclusivamente attraverso la sua API
 * pubblica. La combinazione non e' quindi disponibile direttamente: deve essere
 * scoperta producendo tentativi di apertura.
 * </p>
 * <p>
 * La ricerca considera, in ordine lessicografico, tutte le combinazioni da
 * {@code AAA} a {@code ZZZ}. Un tentativo corrisponde alla prova completa di una
 * singola combinazione. L'oggetto mantiene nel proprio stato anche il numero di
 * tentativi effettuati nell'ultima ricerca conclusa con successo.
 * </p>
 *
 * @author Luca Tesei
 */
public class Burglar {

    // TODO inserire le variabili istanza che servono

    /**
     * Costruisce uno scassinatore associato alla cassaforte indicata. La
     * costruzione non effettua ancora alcun tentativo di apertura.
     *
     * @param aCombinationLock la cassaforte da scassinare
     * @throws NullPointerException se {@code aCombinationLock} e' {@code null}
     */
    public Burglar(CombinationLock aCombinationLock) {
        // TODO implementare
    }

    /**
     * Cerca la combinazione della cassaforte mediante forza bruta, provando in
     * ordine lessicografico tutte le combinazioni da {@code AAA} a {@code ZZZ}.
     * <p>
     * Prima di iniziare la ricerca la cassaforte deve essere posta nello stato
     * chiuso tramite la sua API pubblica. Per ogni combinazione candidata lo
     * scassinatore imposta le tre posizioni e tenta l'apertura. La ricerca
     * termina non appena la cassaforte risulta aperta.
     * </p>
     * <p>
     * Al termine della ricerca la cassaforte e' aperta e
     * {@link #getAttempts()} restituisce il numero di combinazioni provate nella
     * ricerca appena conclusa.
     * </p>
     *
     * @return la combinazione segreta trovata; non puo' essere {@code null}
     */
    public String findCombination() {
        // TODO implementare
        return null;
    }

    /**
     * Restituisce il numero di tentativi effettuati dall'ultima chiamata a
     * {@link #findCombination()} conclusa con successo.
     *
     * @return il numero di combinazioni provate, oppure {@code -1} se questo
     *         scassinatore non ha ancora completato una ricerca
     */
    public long getAttempts() {
        // TODO implementare
        return -1;
    }
}
