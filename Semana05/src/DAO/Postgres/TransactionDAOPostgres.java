package DAO.Postgres;

import Models.Transaction;

public class TransactionDAOPostgres {
    public void inserirTransacao(Transaction transaction) {
        String sql = "INSERT INTO extracao (id, data, valor, tipo) VALUES (?, ?, ?, CAST(? as tipo))";
        String tipoTransaction = (transaction.getTipoTransacao().equals("Depósito")) ? "Depósito" ? "Saque" ? "Envio" : "Recebimento";
        
        try {
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setObject(1, transaction.getId());
            stm.setObject(2, transaction.getData());
            stm.setDouble(3, transaction.getValor());
            stm.setString(4, tipoTransaction);

            stm.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }
}
