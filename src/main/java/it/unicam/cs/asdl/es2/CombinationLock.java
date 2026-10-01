package it.unicam.cs.asdl.es2;

/**
 * Modella una cassaforte dotata di una serratura a combinazione di tre lettere
 * maiuscole dell'alfabeto inglese.
 * <p>
 * Un oggetto di questa classe possiede uno <em>stato interno</em>: in
 * particolare deve ricordare la combinazione segreta, se la cassaforte e'
 * aperta oppure chiusa e le posizioni della manopola rilevanti per il prossimo
 * tentativo di apertura. Tali informazioni fanno parte dell'implementazione e
 * devono essere incapsulate nelle variabili istanza della classe: chi usa la
 * cassaforte interagisce con essa esclusivamente attraverso i metodi pubblici
 * definiti da questa API.
 * </p>
 * <p>
 * Ogni chiamata a un metodo puo' modificare lo stato dell'oggetto. In
 * particolare, un tentativo di apertura utilizza le ultime tre posizioni
 * impostate dopo l'ultimo azzeramento delle posizioni. Dopo ogni tentativo di
 * apertura, riuscito o meno, le posizioni precedentemente impostate non devono
 * essere riutilizzate in un tentativo successivo. Anche la chiusura della
 * cassaforte azzera le posizioni precedentemente impostate.
 * </p>
 *
 * @author Luca Tesei
 */
public class CombinationLock {

    // TODO inserire le variabili istanza che servono

    /**
     * Costruisce una cassaforte inizialmente <strong>aperta</strong> con la
     * combinazione indicata. Al termine della costruzione non ci sono posizioni
     * della manopola gia' impostate da considerare per un futuro tentativo di
     * apertura.
     *
     * @param aCombination la combinazione segreta, costituita esattamente da tre
     *                     lettere comprese tra {@code 'A'} e {@code 'Z'}
     * @throws NullPointerException     se {@code aCombination} e' {@code null}
     * @throws IllegalArgumentException se {@code aCombination} non e' una stringa
     *                                  di esattamente tre lettere maiuscole
     *                                  dell'alfabeto inglese
     */
    public CombinationLock(String aCombination) {
        // TODO implementare
    }

    /**
     * Imposta la manopola sulla posizione indicata. La nuova posizione diventa
     * l'ultima posizione impostata e deve essere ricordata nello stato interno
     * della cassaforte in vista di un successivo tentativo di apertura.
     * <p>
     * Se vengono impostate piu' di tre posizioni prima di una chiamata a
     * {@link #open()}, ai fini del tentativo di apertura contano solo le ultime
     * tre.
     * </p>
     *
     * @param aPosition la posizione della manopola, compresa tra {@code 'A'} e
     *                  {@code 'Z'}
     * @throws IllegalArgumentException se {@code aPosition} non e' una lettera
     *                                  maiuscola dell'alfabeto inglese
     */
    public void setPosition(char aPosition) {
        // TODO implementare
    }

    /**
     * Effettua un tentativo di apertura utilizzando le ultime tre posizioni
     * impostate dopo l'ultimo azzeramento delle posizioni.
     * <p>
     * Se sono state impostate almeno tre posizioni e le ultime tre coincidono,
     * nello stesso ordine, con la combinazione segreta, la cassaforte risulta
     * aperta. In caso contrario una cassaforte chiusa rimane chiusa. Se la
     * cassaforte e' gia' aperta, rimane aperta.
     * </p>
     * <p>
     * In ogni caso, al termine del tentativo tutte le posizioni impostate fino a
     * quel momento vengono dimenticate: un successivo tentativo deve utilizzare
     * soltanto nuove chiamate a {@link #setPosition(char)}.
     * </p>
     */
    public void open() {
        // TODO implementare
    }

    /**
     * Determina lo stato corrente della cassaforte senza modificarlo.
     *
     * @return {@code true} se la cassaforte e' attualmente aperta,
     *         {@code false} se e' chiusa
     */
    public boolean isOpen() {
        // TODO implementare
        return false;
    }

    /**
     * Chiude la cassaforte senza modificare la combinazione segreta.
     * <p>
     * La chiamata azzera inoltre tutte le posizioni della manopola impostate in
     * precedenza. Di conseguenza, dopo una chiamata a questo metodo non e'
     * possibile riaprire la cassaforte chiamando immediatamente {@link #open()}:
     * occorre prima impostare nuovamente la combinazione mediante
     * {@link #setPosition(char)}.
     * </p>
     * <p>
     * Se la cassaforte e' gia' chiusa, rimane chiusa e le posizioni eventualmente
     * impostate vengono comunque azzerate.
     * </p>
     */
    public void lock() {
        // TODO implementare
    }

    /**
     * Chiude la cassaforte e, soltanto se essa e' attualmente aperta, sostituisce
     * la combinazione segreta con quella indicata.
     * <p>
     * Se la cassaforte e' chiusa, la combinazione segreta non viene modificata.
     * In entrambi i casi, al termine della chiamata la cassaforte e' chiusa e le
     * posizioni della manopola precedentemente impostate vengono azzerate.
     * </p>
     * <p>
     * Il parametro viene comunque validato: una combinazione nulla o non valida
     * provoca l'eccezione indicata e non deve produrre una normale modifica dello
     * stato della cassaforte.
     * </p>
     *
     * @param aCombination la nuova combinazione, costituita esattamente da tre
     *                     lettere comprese tra {@code 'A'} e {@code 'Z'}
     * @throws NullPointerException     se {@code aCombination} e' {@code null}
     * @throws IllegalArgumentException se {@code aCombination} non e' una stringa
     *                                  di esattamente tre lettere maiuscole
     *                                  dell'alfabeto inglese
     */
    public void lockAndChangeCombination(String aCombination) {
        // TODO implementare
    }
}
