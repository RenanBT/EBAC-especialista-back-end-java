package br.com.betereli.Service;

import br.com.betereli.dao.IContratoDao;

public class ContratoService implements IContratoService {

   private IContratoDao contratoDao;
    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Retorno Buscar";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Item Excluido";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizado";
    }
}
