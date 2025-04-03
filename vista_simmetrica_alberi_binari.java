public void vistaSimmetrica(NodoBT n){      // BT = binary tree
    if(n == null){
        return;
    }
    if(n.getfiglioSx() != null){
        vistaSimmetrica(n.getfiglioSx());
    }

    esamina(n.getdata());

    if(n.getfiglioDx() != null){
        vistaSimmetrica(n.getfiglioDx());
    }
}
