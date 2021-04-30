# Assignment 2

### Membri del gruppo:
Mottadelli Simone Paolo (820786), Daniele Caliari (816202), Balducci Gianmaria (807141)

### Link della repository:
https://gitlab.com/SimoneMottadelli/2019_assignment2_elicitation.git

### Descrizione del problema e dell'applicazione:
L'applicazione software che si vuole realizzare si pone l'obiettivo di migliorare il servizio di ristorazione dell'Università di Milano-Bicocca. 
L'idea di fondo è quella di poter permettere agli studenti universitari (e non) di ususfruire del servizio mensa anche quando essi non dispongono di una pausa pranzo 
sufficientemente ampia da consentire l'attesa in coda e il consumo del pasto all'interno della sala mensa. Questa situazione occorre spesso quando si manifesta la necessità
di spostarsi da un edificio ad un altro più lontano proprio durante la pausa pranzo. <br/>
Più nello specifico, all'interno del campus dell'Università degli Studi di Milano-Bicocca capita spesso che studenti e docenti debbano cambiare edificio per poter seguire o
impartire le lezioni e, dal momento che il campus universitario si estende per diversi kilometri, tale spostamento può richiedere diversi minuti e può diminuire considerevolmente
il tempo allocabile per la pausa pranzo. Inoltre, questo tempo diponibile può ulteriormente diminuire se gli spostamenti devono avvenire tra le 12.30 e le 13.30, poichè in
questa fascia oraria i servizi di ristorazione universitari sono molto più affollati e, di conseguenza, le code di attesa sono molto più lunghe. Si conclude che coloro che si 
trovino nella suddetta situazione rimangono penalizati e non possono fruire in tranquillità del servizio mensa offerto dall'ateneo. <br/>
Per ovviare a questo problema, si è pensato ad un servizio di take-away in cui consentire la prenotazione di un pasto direttamente da un'app in una delle mense universitarie, 
con pagamento online e conseguente ritiro in un orario prestabilito.
Dunque, l'applicazione vorrebbe poter fornire i seguenti servizi:
1. Per ogni mensa d'ateneo, offrire la possibilità di visualizzare il menù giornaliero; 
2. Offrire la possibilità di ordinare un pranzo take-away o un pranzo da consumare presso una delle mense d'ateneo;
3. Consentire al personale di una mensa di pubblicare il proprio menù giornaliero;
4. Permettere al personale di una mensa di gestire gli ordini effettuati online.

L'applicazione si rivolgerà principalmente a tre categorie di utilizzatori: gli utenti registrati presso l'Università di Milano-Bicocca in qualità di studenti, docenti e 
personale tecnico-amministrativo, gli utenti esterni autorizzati che non hanno né un account UniMiB né un badge universitario e il personale che lavora all'interno della mensa.
Di conseguenza la procedura di registrazione si dividerà in due casi, uno in cui gli utenti UniMiB potranno accedere tramite il proprio account universitario, 
e uno nel quale gli utenti non registrati presso l'università effettueranno una semplice registrazione inserendo i propri dati.

### Stakeholders
1.  **Utente fruente del servizio di ristorazione**: dal momento che l'obbiettivo principale dell'applicazione che si vuole sviluppare è
    migliorare l'esperienza di coloro che intendono fruire del servizio di ristorazione d'ateneo, questo stakeholder utilizzerà
    attivamente l'applicazione che si vuole sviluppare. Conseguentemente, questo stakeholder gioca un ruolo molto importante 
    durante il processo di elicitazione dei requisiti e può aiutare il team di sviluppo a scoprire molti requisiti funzionali e non 
    funzionali dell'applicazione al fine di rendere l'applicazione più usabile e proficua. Ad esempio, potranno emergere requisiti relativi
    alle modalità con cui un utente può prenotare un pasto attraverso l'app. Si noti che fanno parte di questa tipologia di stakeholder
    gli studenti, i docenti, il personale tecnico-amministrativo dell'università, nonché gli utenti esterni autorizzati.
2.  **Personale delle mense d'ateneo**: questo stakeholder assume una rilevante importanza durante la fase di elicitazione dei requisiti, perché,
    quando l'applicazione sarà sviluppata, utilizzerà l'applicazione per pubblicare online i menù giornalieri e gestire gli ordini effettuati
    dagli *utenti fruenti del servizio di ristorazione*. In particolare, questo stakeholder è fondamentale per definire i requisiti funzionali
    e non funzionali necessari per permettere l'erogazione di un miglior servizio di ristorazione tramite l'app. Ad esempio, potrà decidere le 
    modalità con cui un menù può essere inserito all'interno del sistema.
3.  **Rappresentante degli studenti**: in qualità di rappresentante degli interessi degli studenti, questo stakeholder diventa importante ai 
    fini di una chiara ed efficace comunicazione tra il team di sviluppo e gli studenti che sono intesi come i possibili principali fruitori del
    servizio che si vuole sviluppare. La loro presenza diventa fondamentale nel momento in cui è necessario prendere delle decisioni che coinvolgono 
    tutti gli studenti.
4.  **Team di sviluppo**: questo stakeholder è formato da un team di ingegneri del software che hanno il compito di progettare e sviluppare tutte le funzionalità
    dell'applicazione. Di conseguenza svolge un ruolo fondamentale in quanto è in grado di capire e di definire se i requisiti forniti dagli
    altri stakeholder sono effettivamente integrabili e sviluppabili nell'applicativo, con la possibilità di arricchire l'insieme dei requisiti
    funzionali e non funzionali, essendo in grado di proporre delle soluzioni software e hardware. <br/>
    N.B.: Per questo assignment assumiamo di essere il *Team di sviluppo* che deve anche progettare il piano di elicitazione dei requisiti.
    



5. **Responsabile dell'ufficio tesoreria d'ateneo**: Il Ministero dell'Istruzione dell'Università e della Ricerca (Miur) attribuisce annualmente
    i finanziamenti ordinari alle Università statali. Questo stakeholder si occupa del monitoraggio dei flussi di cassa e del fabbisogno,
    valutando la sostenibilità finanziaria delle politiche di investimento dell'ateneo. Poichè i requisiti funzionali e non funzionali che si vogliono 
    implementare hanno un impatto sui costi di realizzazione del progetto, il *Responsabile dell'ufficio tesoreria d'ateneo* dovrà quindi essere
    mantenuto aggiornato su tali costi e potrà valutare il budget da allocare all'intero progetto. Svolge un ruolo importante nel workflow 
    del processo di elicitazione dei requisiti fornendo i dati necessari alla valutazione dei costi e fattibilità.
6. **Responsabile dell'ufficio infrastrutture d'ateneo**: fornisce l'hardware necessario per realizzare il progetto e, dunque, è uno stakeholder
    essenziale poiché può prendere parte alle decisioni progettuali. Essendo inoltre responsabile del servizio di ristorazione all'interno 
    dell'università ha una vasta e approfondita conoscenza del system-as-is, base di partenza dal quale si intende appunto sviluppare l'applicazione, e 
    quindi fornirà importanti informazioni sulla situazione esistente al momento e su quella che si intende creare dopo lo sviluppo del nuovo servizio.
7. **Azienda che fornisce il cibo alle mense d'ateneo**: dal momento che nel system-as-is questa azienda si occupa di distribuire il cibo nelle mense 
    universitarie, essa è uno stakeholder che non può essere trascurato per la corretta organizzazione del system-to-be. Per esempio, può essere utile
    per scoprire nuovi requisiti funzionali relativi alla gestione dei menù giornalieri all'interno dell'applicazione.
8. **Ente di credito**: questo stakeholder è indirettamente coinvolto nello sviluppo di questa applicazione in quanto si prevede la possibilità da parte
    dell'utente di effettuare un ordine con conseguente pagamento online. Tuttavia, non verrà preso in considerazione durante il piano di elicitazione dei
    requisiti in quanto momentaneamente non raggiungibile.
9. **Rappresentante del personale di una mensa d'ateneo**: dal momento che il *Personale delle mense d'ateneo* è un insieme troppo grande di individui,
    è necessario che vengano scelti dei membri da tale insieme. In questo modo, il *Team di sviluppo* ha la possibilità di interagire direttamente anche
    con alcuni membri delle mense al fine di scoprire nuovi requisiti funzionali e non funzionali che possano risolvere le esigenze di questi ultimi.
10. **Consulente legale esperto in trattamento di dati personali**: affinché gli *Utenti fruenti del servizio di ristorazione* possano effettuare degli
    ordini online attraverso l'app, sarà necessario implementare un meccanismo di registrazione e autenticazione al sistema, che consenta a questi utenti
    l'inserimento dei propri dati personali e dei dati relativi ai metodi di pagamento desiderati (e.g., una carta di credito). Inoltre, anche per il
    *Personale delle mense d'ateneo* sarà necessario un meccanismo di registrazione e autenticazione al sistema in modo tale che le funzionalità necessarie 
    per la gestione degli ordini online e dei menù giornalieri siano consentite solo a quest'ultimo stakeholder. Pertanto, è necessaria la presenza di un
    *Consulente legale esperto in trattamento di dati personali*, che possa aiutare il *Team di sviluppo* a far emergere quei requisiti funzionali e non
    funzionali necessari per il corretto trattamento dei dati personali degli utenti, come previsto dal regolamento n. 2016/679 (GDPR).

### Piano delle attività di elicitazione dei requisiti
Il piano delle attività di elicitazione dei requisiti prevede le seguenti fasi:
1.  **Background study**: in questa attività iniziale il *team di sviluppo* deve analizzare il dominio applicativo in cui
    il system-to-be diventerà operativo, ponendo l'attenzione sui concetti, le dinamiche e le regole generali caratterizzanti il
    system-as-is. La maggior parte delle informazioni possono essere reperite dal sito web d'ateneo.
    Questa fase preliminare è importante affinché il *team di sviluppo* possa comunicare con gli altri stakeholders
    in maniera più efficace, evitando di sottoporre domande che possano annoiare o infastidire la parte interessata, ad esempio durante 
    le interviste o le group sessions. <br/>
    Più nello specifico, il *team di sviluppo* dovrà approfondire la propria conoscenza nelle seguenti aree:
    *  le tipologie di borse di studio che possono essere assegnate agli studenti;
    *  le metodologie di pagamento utilizzate nel system-as-is;
    *  l'organizzazione del personale all'interno delle mense;
    *  l'organizzazione dell'azienda che fornisce il cibo alle mense d'ateneo (attualmente Sodexo);
    *  il sistema informativo e informatico del system-as-is;
    <br/>    

2.  **Group sessions strutturate**: Dopo la fase di *Background study* vengono svolte delle group sessions strutturate che durano pochi
    giorni per permettere agli stakeholders di interagire tra loro e sviluppare una visione più ampia e dettagliata
    dell'applicativo e del problema che deve essere risolto con il system-to-be.
    Gli stakeholders che partecipano a queste prime group sessions sono:
    *  *Rappresentante degli studenti*;
    *  *Rappresentanti del personale delle mense d'ateneo*;
    *  *Team di sviluppo*;
    *  *Responsabile dell'ufficio tesoreria d'ateneo*;
    *  *Responsabile dell'ufficio infrastrutture d'ateneo*;
    *  *Consulente legale esperto in trattamento di dati personali*.
    
    <br/>
    Più in dettaglio, queste prime riunioni hanno l'obiettivo di generare idee su come offrire il servizio richiesto e di comprendere quali sono
    gli utilizzatori del sistema che si vuole progettare, nonché di capire le esigenze di questi ultimi. Queste informazioni sono necessarie per
    la progettazione dei questionari che verranno somministrati agli utenti finali. Si è deciso di inserire queste group sessions in questo
    punto del piano di elicitazione dei requisiti perché il *Team di sviluppo* deve prima approfondire le proprie conoscenze di dominio relativamente
    alle aree descritte nella sezione *Background study* per non essere colto impreparato durante l'interazione con gli altri stakeholders. 
    Inoltre, siccome ogni partecipante ha un ruolo ben definito e contribuisce a far emergere i requisiti in accordo con il suo ruolo, queste group sessions
    sono strutturate. <br/>
    I *Rappresentanti degli studenti* dovranno far emergere le problematiche affliggenti il system-as-is e dovranno collaborare con gli altri stakeholders 
    per individuare le funzionalità necessarie a risolvere le esigenze degli studenti. In particolare, potranno utilizzare delle storie per descrivere una
    tipica giornata di uno studente all'interno del campus universitario, evidenziando come l'attuale servizio di ristorazione d'ateneo sia molto scomodo
    per quegli studenti che necessitano di spostarsi di edificio durante l'orario di pranzo. Potranno mostrare al *Team di sviluppo* degli scenari 
    che descrivano come l'applicazione potrebbe funzionare (e.g., come potrebbe avvenire la prenotazione di un pasto in una determinata mensa). <br/>
    I *Rappresentanti del personale delle mense d'ateneo* dovranno aiutare il *Team di sviluppo* ad individuare le funzionalità richieste per l'erogazione
    del nuovo servizio di ristorazione. In particolare, dovranno fornire degli esempi e degli scenari d'uso del sistema, ad esempio, per aggiungere le pietanze
    del giorno all'interno del menù di una mensa oppure per gestire un pranzo prenotato online da uno studente. <br/>
    Il *Team di sviluppo* dovrà interagire con gli altri stakeholders per cogliere quali requisiti funzionali e non funzionali devono
    essere soddisfatti dall'applicazione software commissionata, basandosi anche su quanto evinto dall'attività di *Background study*. Dovrà discutere le varie 
    funzionalità porposte dagli altri stakeholders mostrando loro diverse modalità con cui queste possono essere implementate (e.g., i modi con cui la ricerca di
    una mensa con relativo menù giornaliero può essere implementata: con barra di ricerca, con una mappa, ecc...). Inoltre, questo stakeholder potrà comunicare al
    *Responsabile del'ufficio tesoreria d'ateneo* delle stime iniziali sui costi di ciascuna funzionalità emersa. <br/>
    Il *Responsabile dell'ufficio tesoreria d'ateneo* ha il compito di stabilire il budget da allocare per il progetto, tenendo conto delle stime sui costi calcolati dal 
    *Team di sviluppo* sui i requisiti individuati. Potrà suggerire di aggiungere o eliminare elementi all'insieme dei requisiti espressi sinora per diminuire i costi. <br/>
    Il *Responsabile dell'ufficio infrastrutture d'ateneo* potrà intervenire durante le group sessions per segnalare se ci sono delle caratteristiche o
    aspetti dell'applicativo che possono generare dei problemi sul servizio di ristorazione dell'ateneo, anche dal punto di vista legale, aiutando, dunque, il
    *Team di sviluppo* a elicitare nuovi requisiti soprattutto non funzionali. <br/>
    Il *Consulente legale esperto in trattamento di dati personali* interagirà durante le group sessions accertandosi che i requisiti funzionali e non funzionali
    emersi durante questa attività rispettino il regolamento europeo per il trattamento dei dati personali e di privacy (GDPR). Potrà aiutare il *Team di sviluppo* a
    individuare quei requisiti necessari affinché l'applicazione gestisca nel modo corretto e legale i dati personali degli utenti. Ad esempio, potrà definire le modalità
    con cui i dati degli utenti possono essere salvati all'interno del sistema e come questi dati debbano essere trattati affinché l'applicazione possa offrire i servizi
    e le funzionalità richieste in maniera legale. <br/>
    Le group session terminano con un'analisi preliminare stimata sulla fattibilità e sui costi del progetto e i requisiti individuati in questa attività 
    forniranno una struttura di base per la progettazione dei questionari per gli utenti che utilizzeranno il sistema.
    <br/><br/>

3.  **Somministrazione del questionario agli utenti fruenti del servizio di ristorazione**: gli stakeholders coinvolti in questa attività 
    sono gli *Utenti fruenti del servizio di ristorazione*, i quali non possono essere intervistati singolarmente perché costituiscono
    un insieme troppo grande di individui. Per far fronte a questo problema, si vuole progettare un questionario che possa raccogliere
    molti dati relativamente all'uso dell'applicazione che si vuole sviluppare e alle possibili funzionalità che essa potrà offrire. <br/>
    Questa attività viene eseguita successivamente all'attività di *Group session strutturata con responsabili uffici d'ateneo e rappresentanti degli studenti* 
    e in parallelo con l'attività di *Somministrazione del questionario al personale della mensa*, perchè in questo punto del piano di elicitazione dei requisiti il 
    *team di sviluppo* ha acquisito già le informazioni necessarie per poter progettare efficacemente il questionario. <br/>
    Nello specifico, il questionario si pone l'obbiettivo di scoprire come i seguenti requisiti verranno implementati (per assunzione i requisiti son stati 
    individuati durante la fase di *Group sessions strutturate*):
    *  La piattaforma su cui si vuole realizzare l'applicazione: Android o iOS;
    *  La modalità con cui l'utente può effettuare l'ordine di un pranzo;
    *  La modalità con cui l'utente può visualizzare il menù giornaliero per ciascuna mensa;
    *  La modalità con cui l'utente vuole essere notificato della conferma dell'ordine o dell'ordine pronto per il ritiro;
    *  La possibilità di conoscere l'affluenza delle persone in una determinata mensa;
    *  La possibilità di conoscere gli allergeni alimentari dei piatti ordinabili;
    *  La possibilità di visualizzare lo storico degli ordini;
    <br/>
    
4.  **Somministrazione del questionario al personale della mensa**: in questa fase viene coinvolto lo stakeholder *Personale delle mense d'ateneo* al quale viene
    somministrato un questionario per ragioni di praticità, così come per gli studenti, vista l'impossibilità di intervistare tutti i componenti del personale,
    e per raccogliere dati e informazioni utili sulle modalità d'uso ipoteticamente migliori dell'applicazione da parte di essi. <br/>
    Questa attività è eseguita in parallelo con la *Somministrazione del questionario agli utenti fruenti del servizio di ristorazione* a seguito della group session iniziale
    sulla base del quale verranno effettuate domande mirate. Il questionario è somministrato a questo punto del workflow in quanto il *team di sviluppo* ha già acquisito le 
    informazioni necessarie per poterlo strutturare in modo corretto dalle prime *group sessions strutturate*<br/>
    Il questionario è strutturato per ricavare le modalità con cui i seguenti principali requisiti verranno implementati (per assunzione si suppone che i requisiti sono stati
    individuati durante la fase di *Group sessions strutturate*):
    * La modalità con cui l'addetto visualizza gli ordini da evadere;
    * La modalità con cui l'addetto interagisce con gli ordini da evadere;
    * La modalità con cui l'addetto carica i menù giornalieri sull'applicazione;
    <br/>
    
5.  **Analisi dei risultati ed estrazione dei requisiti**: questa fase coinvolge il *Team di Sviluppo* ed è eseguita a seguito delle fasi di
    *Somministrazione del questionario agli utenti fruenti del servizio di ristorazione* e di *Somministrazione del questionario al personale della mensa* per poterne
    analizzare i risultati. Essendo due i questionari prodotti, per quello rivolto agli studenti l'obiettivo sarà quello di ricavare informazioni utili sulle aspettative
    degli *Utenti fruenti del servizio di ristorazione* riguardo al funzionamento dell'applicazione e a modalità di utilizzo potenzialmente preferite, mentre per quello
    indirizzato al personale ricavare indicazioni sulle preferenze del *Personale delle mense d'ateneo* in linea con la loro metodologia di lavoro. In particolare, si cercherà,
    sulla base delle risposte ricevute e delle conclusioni tratte dalle analisi di cui sopra, di ricavare i requisiti funzionali dell'applicazione (e.g., le modalità con cui
    gli *Utenti fruenti sel servizio di risotrazione* vogliono poter selezionare i piatti da ordinare) e questioni di rilievo che potrebbero essere discusse nell'eventuale 
    group session seguente. 

    
6.  **Valutazione dei costi e verifica della fattibilità e della presenza di conflitti tra i requisiti**:
    Questa attività si pone l'obbiettivo di valutare le informazioni ricavate dall'attività di *Analisi dei risultati ed estrazione dei requisiti* e dalle *Group sessions strutturate*
    iniziali e, per questa ragione, è stata inserita nel piano di elicitazione dopo l'attività di *Analisi dei risultati ed estrazione dei requisiti*. I partecipanti di questa fase
    sono il *Team di sviluppo*, il *Responsabile dell'ufficio tesoreria d'ateneo* e il *Responsabile dell'uffcio infrastrutture d'ateneo*. <br/>
    Più nel dettaglio, inizia con la verifica della presenza di possibili conflitti tra i requisiti funzionali e non funzionali. Questo è importante perchè, ad esempio, 
    potrebbe accadere che gli individui che hanno completato i questionari non abbiano fornito la stessa risposta ad una domanda mirata a far emergere uno specifico requisito
    (e.g., non c'è una maggioranza di utenti che preferisce un modo piuttosto che un altro di visualizzare il menù di una determinata mensa).
    Successivamente, grazie alla presenza dei responsabili degli uffici d'ateneo incaricati, si valutano i costi legati alla realizzazione dei singoli requisiti individuati e 
    si confrontano con il budget allocato per la realizzazione del progetto. Infine, si valuta l'effettiva fattibilità del progetto sulla base dei requisiti sia funzionali 
    sia non funzionali che sono stati scelti, sfruttando la conoscenza tecniche del *Team di sviluppo*. Le eventuali criticità emerse durante in questa fase dovranno essere
    discusse in una nuova group session che coinvolga tutte le parti interessate. <br/>
    
7.  **Group session strutturata con le parti interessate**: 
    Questa attività ha l'obbiettivo di risolvere i problemi che sono emersi durante la fase di *Valutazione dei costi e verifica della fattibilità e della presenza di conflitti tra i requisiti* 
    ed è stata inserita in questo punto del piano di elicitazione dei requisiti proprio per questo motivo. Gli stakeholders coinvolti in questa fase sono:
    * *Rappresentanti degli studenti*;
    * *Team di sviluppo*;
    * *Responsabile dell'ufficio tesoreria d'ateneo*;
    * *Responsabile dell'ufficio infrastrutture d'ateneo*;
    * *Rappresentanti del personale delle mense d'ateneo*;
    * *Consulente legale esperto in trattamento di dati personali*.
    <br/>
    
    Più nello specifico, questa group session è una attività strutturata che coinvolge tutte le parti direttamente interessate alla realizzazione del progetto e inizia
    con l'esposizione dei problemi che sono stati riscontrati nella fase precedente. Si noti che è un'attività strutturata perché, come nelle group sessions precedenti,
    ogni ogni partecipante ha un ruolo ben definito e contribuisce a far emergere i requisiti in accordo con il suo ruolo. <br/>Il *Team di sviluppo* elenca tutti i problemi riguardanti la fattibilità e ai costi 
    di realizzazione del system-to-be, nonché i conflitti che si sono generati tra i requisiti, cosicché tutti gli stakeholders siano aggiornati. Successivamente, gli
    stakeholders cercano di trovare delle soluzioni condivise a tali problemi; ad esempio, se ci sono dei conflitti tra un insieme di requisiti funzionali o non funzionali 
    (e.g., non esiste una maggioranza di utenti che hanno risposto alla stessa maniera in una domanda del questionario), si deve decidere quali di essi devono essere
    implementati e quali possono essere scartati oppure certi requisiti non possono essere implementati perché troppo costosi e, quindi, è necessario trovare delle alternative.
    In questa attività i responsabili degli uffici d'ateneo si accertano che le soluzioni proposte rientrino nel budget e il *Team di sviluppo* utilizza le proprie conoscenze
    informatiche per determinare la fattibilità delle funzionalità che vengono proposte come alternative dai *Rappresentanti degli studenti* e dai *Rappresentanti del personale delle mense d'ateneo*. 
    Invece, il *Consulente legale esperto in trattamento di dati personali* continua ad accertarsi che le funzionalità proposte rispettino le normative 
    sulla protezione e privacy dei dati personali degli utenti finali. <br/>
    Alla fine di questa attività si assume che i principali requisiti iniziali dell'applicazione, funzionali e non funzionali, siano stati individuati e che i problemi 
    legati alla fattibilità e ai costi siano stati risolti.

### Presentazione del questionario agli utenti fruenti del servizio di ristorazione
*Link questionario*: https://docs.google.com/forms/d/1awC7Gopmg6uq77TYiJ94H1dMZVHMqrgUnnR_5YVQ-U8/prefill

Questo questionario è stato progettato con lo scopo di capire come gli *utenti fruenti del servizio di ristorazione* vorrebbero che l'applicazione funzionasse e, dunque,
comprendere in che modo le funzionalità offerte a questi utenti dall'applicazione dovranno essere implementate. Più nello specifico, il questionario si compone di due sezioni: 
1.  *Sezione preliminare*: questa sezione è composta da semplici e rapide domande utili sia per effettuare una piccola statistica sugli utenti che stanno rispondendo al
                            questionario, sia per capire quanto gli utenti rispondono con attenzione al questionario.
2. *Sezione principale*: questa sezione, invece, ha l'obbiettivo di conoscere come l'utente vorrebbe che le funzionalità dell'applicazione vengano implementate. Si noti
                        che se l'utente sta rispondendo a queste domande, allora si assume che è effettivamente interessato a collaborare allo sviluppo di questa app.

Di seguito si trovano le domande per le due sezioni del questionario e sotto ciascuna domanda è indicato l'obbiettivo della domanda.

La *sezione preliminare* si compone di 4 domande:

1.  Qual è la tua professione?
    * Studente
    * Docente
    * Lavoratore esterno (non studente)
    * Tecnico-amministrativo
    

Questa prima domanda ha lo scopo di effettuare una partizione dell'insieme degli *utenti fruenti del servizio di ristorazione* al fine di capire se esistono delle esigenze
diverse a seconda della classe d'appartenenza (studente, docente, lavoratore esterno o tecnico-amministrativo).

2. Quanto ti senti d'accordo con questa affermazione: "Mi capita spesso di dover cambiare edificio durante l'orario di pranzo e di non aver tempo per consumare un pasto 
    in mensa in tranquillità"?
    * Un valore compreso tra 1 e 4, dove 1 indica "non sono d'accordo" e 4 indica "sono molto d'accordo"

Questa seconda domanda, congiuntamente alla prima, ha l'obbiettivo di fare una piccola statistica sul profilo degli utenti che stanno rispondendo al questionario. Nello specifico, 
consentono di determinare quanto ogni classe di utenti si ritrova nella suddetta situazione.

3. Quante volte ti trovi in questa situazione?
    * Un valore compreso tra 1 e 4, dove 1 indica "Mai" e 4 indica "Sempre"

Questa terza domanda, congiuntamente alla seconda domanda, serve per capire se l'utente sta rispondendo con coerenza alle domande. Si noti che è importante l'ordine tra la seconda e la
terza domanda, perchè la seconda domanda spiega meglio il problema e il contesto, mentre la terza domanda serve per effettuare il controllo della coerenza tra le due risposte.
Ad esempio, se nella domanda precedente l'utente risponde 4 e, successivamente, in questa domanda risponde 1, o viceversa, allora significa che l'utente non sta rispondendo con attenzione 
alle domande che gli vengono presentate.

4. Troveresti comodo poter ordinare un pranzo take away da una mensa dell'Università di Milano Bicocca tramite un'app?
    * Sì
    * No

Questa quarta domanda serve per capire se l'utente userebbe mai l'applicazione che si intende realizzare. E' chiaro che se la risposta è "No" allora non ha senso continuare con
la compilazione della seconda sezione del questionario, cioè la *sezione principale*, in quanto non fornirebbe delle informazioni utili al processo di elicitazione dei requisiti.

La *Sezione principale* si articola in 11 domande:
1. Quale sistema operativo è installato sul tuo smartphone?
    * Android
    * iOS
    * Altro

Questa domanda viene posta per ottenere, in fase di analisi dei dati, un dato concreto sul sistema operativo più utilizzato dagli utenti effettivamente interessati allo sviluppo
del servizio che si vuole offrire tramite l'applicazione. Sulla base di questa risposta, si deciderà su quale piattaforma iniziare a sviluppare l'app.

2. Come vorresti visualizzare il menù di una mensa? 
    * Selezionando la mensa desiderata da una lista contenente tutte le mense dell'ateneo
    * Cliccando sulla mensa desiderata in una mappa
    * Scrivendo il nome dell'edificio in cui è presente la mensa in una barra di ricerca (e.g., "U12", "U6")

La seconda domanda ha lo scopo di capire nello specifico come un utente gradirebbe visualizzare il menù di una singola mensa d'ateneo; si vuole capire quindi, tra quelle proposte,
quale sia l'alternativa che gli utenti troverebbero più intuitiva ed efficace per l'utilizzo dell'applicazione.

3. Come vorresti selezionare i piatti da ordinare?
    * Spuntando i piatti desiderati dal menù
    * Trascinando i piatti desiderati in un carrello

Questa domanda ha l'obbiettivo di capire come si dovrà realizzare la selezione dei piatti da ordinare affinché l'utente riesca ad ordinare un pranzo in maniera più semplice
e veloce possibile.


4. Quanto riterresti utile poter pagare online registrando uno o più metodi di pagamento (e.g., carta di credito)?
    * Un valore compreso tra 1 e 4, dove 1 indica "Non utile" e 4 indica "Molto utile"

Questa quarta domanda serve per capire se è necessario implementare un meccanismo di registrazione di uno o più metodi di pagamento. Ad esempio, un utente potrebbe voler
registrare il suo badge universitario come metodo di pagamento di default.

5. Quanto riterresti utile poter pagare in contanti al ritiro dell'ordine?
    * Un valore compreso tra 1 e 4, dove 1 indica "Non utile" e 4 indica "Molto utile"

Questa domanda cerca di capire se l'utente è disponibile ad ordinare un pranzo take away pagando al momento del ritiro. In caso affermativo, sarà necessario offrire la possibilità
agli utenti di ordinare un pranzo senza l'obbligo di pagare in anticipo.

6. Come preferiresti ricevere la notifica di conferma dell'ordine?
    * Tramite un SMS: un valore compreso tra 1 e 4, dove 1 indica "Non gradito" e 4 indica "Molto gradito"
    * Tramite una e-mail: un valore compreso tra 1 e 4, dove 1 indica "Non gradito" e 4 indica "Molto gradito"
    * Tramite una semplice notifica sull'app: un valore compreso tra 1 e 4, dove 1 indica "Non gradito" e 4 indica "Molto gradito"

Questa domanda ha l'obbiettivo di capire con che modalità l'app deve notificare l'utente dell'avvenuto dell'ordine.

7. Come vorresti essere notificato quando il tuo ordine è pronto per il ritiro?
    * Tramite un SMS: un valore compreso tra 1 e 4, dove 1 indica "Non gradito" e 4 indica "Molto gradito"
    * Tramite una e-mail: un valore compreso tra 1 e 4, dove 1 indica "Non gradito" e 4 indica "Molto gradito"
    * Tramite una semplice notifica sull'app: un valore compreso tra 1 e 4, dove 1 indica "Non gradito" e 4 indica "Molto gradito"
    * Visualizzando l'identificativo dell'ordine su uno schermo nella mensa da cui è stato effettuato l'ordine: un valore compreso tra 1 e 4, dove 1 indica "Non gradito" e 4 indica "Molto gradito"

Questa domanda è necessaria per capire come l'app dovrà notificare l'utente del fatto che l'ordine è pronto per essere ritirato.

8. Quanto troveresti utile poter visualizzare uno storico degli ordini effettuati con tutte le informazioni relative ai singoli pasti?
    * Un valore compreso tra 1 e 4, dove 1 indica "Non utile" e 4 indica "Molto utile"

Questa domanda ha l'obbiettivo di capire se è importante che l'applicazione fornisca un modo per visualizzare lo storico degli ordini effettuati. Questo può essere utile
all'utente per capire cosa ordinare in un determinato giorno, sulla base di cosa ha mangiato i giorni precedenti.

9. Quanto ritieni importante poter visualizzare gli allergeni alimentari di ciascuna pietanza?
    * Un valore compreso tra 1 e 4, dove 1 indica "Non importante" e 4 indica "Molto importante"

Questa domanda è stata progettata per capire se è una funzionalità desiderata, oppure no, quella di permettere all'utente la visualizzazione degli allergeni
alimentari di ciascuna pietanza. Questo può essere utile nel caso in cui un utente è allergico a determinati piatti e vuole ordinare un pranzo take away consapevolmente.

10. Quanto riterresti importante conoscere l'affluenza di persone in una determinata mensa?
    * Un valore compreso tra 1 e 4, dove 1 indica "Non importante" e 4 indica "Molto importante"

Questa domanda serve per capire quanto è importante che l'applicazione offra un meccanismo di controllo dell'affluenza per ciascuna mensa dell'ateneo. Questa
funzionalità può essere utile, ad esempio, nel caso in cui un utente desiderasse semplicemente mangiare in mensa senza ordinare un pasto tramite l'applicazione.

11. Avresti dei suggerimenti per lo sviluppo di questa applicazione?
    * Risposta aperta

Questa ultima domanda ha l'obbiettivo di permettere all'utente di commentare una risposta data precedentemente oppure di suggerire una qualche funzionalità che
non è stata considerata nelle domande a risposta chiusa precedenti. <br/> <br/>

Tutte le domande del questionario sono obbligatorie, tranne l'ultima a risposta aperta. <br/><br/>
Inoltre, è stata usata una scala da 1 a 4 nelle risposte per due motivi: in questo modo l'utente è obbligato a prendere una posizione rispetto alle domande che vengono poste e, inoltre, una scala così ridotta consente di distinguere meglio le risposte. <br/> <br/>
Dal momento che Instagram è uno dei social network più utilizzati dai possibili *Utenti fruenti del servizio di ristoraizone* e, dunque, è uno dei modi più efficaci e veloce per 
raggiungere questi utenti finali, il questionario è stato somministrato attraverso alcune pagine Instagram dell'Università di Milano-Bicocca (e.g., SpottedBicocca). <br/>
Il questionario è stato creato sulla piattaforma *Moduli Google* e quindi distribuito tramite il link apposito per la compilazione online.

### Risultati del questionario
I dati grezzi sulle risposte del questionario si possono trovare all'interno della repository nel file "Questionario utenti servizio ristorazione (Risposte).xlsx". <br/><br/>

I grafici costruiti a partire da un'analisi dei dati del questionario si possono trovare all'interno della repository nel file "Analisi risultati questionario utenti servizio ristorazione.pdf". <br/><br/>

Di seguito verranno mostrati i risultati dei questionari organizzati nelle due sezioni *Sezione preliminare* e *Sezione principale* e, in quest'utlima sezione, per ciascuna 
domanda verranno elencati i requisiti che sono emersi.<br/><br/>

**Sezione preliminare**: <br/><br/>
Da come si può evincere dai risultati, 50 sono gli utenti che hanno compilato il questionario, di cui il 98% è costituito dalla classe Studente e dalla classe Lavoratore
esterno (non studente). <br/>
I risultati mostrano che gli utenti sono stati attenti e coerenti durante la fase di compilazione del questionario; infatti, solamente l'utente che ha compilato il questionario 
numero 34 si è rivelato incoerente: nella *Sezione preliminare* ha risposto 4 alla prima domanda e 1 alla seconda domanda. <br/>
Inoltre, la maggior parte degli utenti (48 utenti su 50) si è dimostrata interessata all'idea di realizzare questa applicazione e ha proseguito con la compilazione della
*Sezione principale* del questionario. <br/><br/>

**Sezione principale** (il punto i-esimo in questa lista puntata corrisponde alla domanda i-esima in questa sezione del questionario): <br/><br/>
1. Dal momento che 37 su 48 utenti (77.1%) utilizzano un dispositivo Android, allora:
    * L'applicazione dovrà essere realizzata per dispositivi Android.
2. Dal momento che 28 utenti su 48 (58.3%) desiderano poter visualizzare il menù di una mensa selezionando la mensa desiderata da una lista contentente tutte le mense dell'ateneo e solamente il 27.1% e 14.6%, rispettivamente, con le altre due modalità, si ha:
    * L'applicazione deve poter mostrare la lista delle mense dell'ateneo.
    * L'utente deve poter selezionare una mensa dalla lista delle mense dell'ateneo e visualizzare il menù giornaliero per la mensa selezionata.
3. Dal momento che 41 utenti su 48 (85.4%) considerano più efficace e semplice selezionare i piatti da ordinare spuntando i piatti direttamente dal menù, si ha:
    * L'applicazione deve consentire all'utente di spuntare i piatti dal menù visualizzato per poterli ordinare.
    * L'applicazione deve consentire all'utente di procedere con l'ordine dei piatti selezionati.
4. Siccome 47 utenti su 48 (98%) desidererebbero poter pagare online l'ordine, utilizzando un metodo di pagamento registrato, allora:
    * L'applicazione deve consentire all'utente di inserire i dati di un metodo di pagamento per registrare un metodo di pagamento.
    * L'applicazione deve consentire all'utente la registrazione di più metodi di pagamento.
    * L'applicazione deve consentire all'utente di selezionare il metodo di pagamento desiderato.
    * L'applicazione deve consentire il pagamento dell'ordine utilizzando il metodo di pagamento selezionato.
5. Siccome 30 utenti su 48 (62%) ritengono utile il fatto di poter pagare in contanti, allora:
    * L'applicazione deve poter consentire di effettuare un ordine senza l'obbligo di pagare in anticipo online.
    * L'applicazione deve poter consentire all'utente di selezionare il metodo di pagamento "Contanti".
6. Dal momento che 46 utenti su 48 (96%) ritengono efficace il meccanismo di notifica direttamente sull'app, solamente 16 utenti su 48 (33%) ritengono completamente inutile 
    il meccanismo di notifica tramite e-mail e 32 utenti su 48 (66.6%) ritengono inutile il meccanismo di notifica tramite SMS, allora:
    * L'applicazione deve notificare l'utente della conferma dell'ordine tramite una notifica all'interno dell'applicazione.
    * L'applicazione deve consentire all'utente l'inserimento di un indirizzo e-mail per la notifica della conferma dell'ordine.
    * L'applicazione deve consentire all'utente la modifica dell'indirizzo e-mail inserito per la conferma dell'ordine.
    * L'applicazione deve notificare l'utente della conferma dell'ordine tramite una notifica via e-mail.
7. Siccome 36 utenti su 48 (75%) ritengono poco utile essere notificato via SMS quando l'ordine è pronto per essere ritirato e, in generale, si ritiene più utile le modalità 
    alternative: allora:
    * L'applicazione deve notificare l'utente quando l'ordine è pronto al ritiro attraverso una notifica sull'app.
    * L'applicazione deve consentire all'utente l'inserimento di un numero di telefono per essere notificato via SMS quando un ordine è pronto per il ritiro.
    * L'applicazione deve consentire all'utente la modifica del numero di telefono inserito per essere notificato via SMS quando un ordine è pronto per il ritiro.
    * L'applicazione deve notificare via SMS l'utente quando l'ordine è pronto per il ritiro.
    * L'applicazione deve consentire all'utente la visualizzazione del codice identificativo dell'ordine.
    * L'applicazione deve mostrare i codici identificativi degli ordini pronti per il ritiro su un tabellone luminoso all'interno della mensa in cui è stato processato l'ordine. 
8.  Siccome 36 utenti su 48 (75%) ritengono importante poter visualizzare uno storico degli ordini effettuati con tutte le informazioni relative ai singoli pasti, allora:
    * L'applicazione deve poter consentire all'utente di visualizzare la storia degli ordini effettuati con tutte le informazioni relative ai singoli pasti.
9. Dal momento che 43 utenti su 48 (89.6%) ritengono utile poter visualizzare gli allergeni alimentari di ciascuna pietanza, allora:
    * L'applicazione deve consentire all'utente di visualizzare gli allergeni alimentari di ciascuna pietanza.
10. Siccome 39 utenti su 48 (81.25%) ritengono importante conoscere l'affluenza di persone in una determinata mensa, allora:
    * L'applicazione deve mostrare un indicatore di quante persone sono in coda in una determinata mensa.
11. Dai suggerimenti degli utenti, possiamo estrarre ulteriori requisiti:
    *  L'applicazione deve poter mostrare una stima temporale relativa al tempo di preparazione di un determinato pranzo.
    *  L'applicazione deve poter mostrare i valori nutrizonali di ciascun piatto.
    * L'applicazione deve poter mostrare le informazioni sulla dieta tenuta durante la settimana.