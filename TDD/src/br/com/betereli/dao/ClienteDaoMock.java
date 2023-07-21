package br.com.betereli.dao;

public class ClienteDaoMock implements IClienteDao{

    @Override
    public String salvar() {
        return "Sucesso";
    }
}
