public void addNodo(int valore){
    NodoBT n = new NodoBT(valore);
    NodoBT nodoCorrente, nodoPrecedente;
    if(ptr == null){            // ptr = puntatore alla radice dell'albero
        ptr = new NodoBT(valore);   // uguale a scrivere ptr = n;
    }else{
        nodoPrecedente = ptr;
        if(valore < ptr.getdata()){
            nodoCorrente = nodoPrecedente.getfiglioSx();
        }else{
            nodoCorrente = nodoPrecedente.getfiglioDx();
        }
        while(nodoCorrente != null){            // con il while andiamo a controllare anche i nodi sottostanti
            nodoPrecedente = nodoCorrente;      // ripetendo lo stesso ciclo appena fatto
            if(valore < nodoCorrente.getdata()){
                nodoCorrente = nodoCorrente.getfiglioSx();
            }else{
                nodoCorrente = nodoCorrente.getfiglioDx();
            }
        }
        if(valore < nodoPrecedente.getdata()){
            nodoPrecedente.setfiglioSx(n);
        }else{
            nodoPrecedente.setfiglioDx(n);
        }
    }
}
