package com.trybe.simuladordepix;

import java.io.IOException;

public class ProcessadorDePix {

  private final Servidor servidor;

  public ProcessadorDePix(Servidor servidor) {
    this.servidor = servidor;

  }

  /**
   * Executa a operação do pix. Aqui é implementada a lógica de negócio sem envolver as interações
   * do aplicativo com a pessoa usuária.
   *
   * @param valor Valor em centavos a ser transferido.
   * @param chave Chave Pix do beneficiário da transação.
   *
   * @throws ErroDePix Erro de aplicação, caso ocorra qualquer inconformidade.
   * @throws IOException Caso aconteça algum problema relacionado à comunicação entre o aplicativo e
   *         o servidor na nuvem.
   */

  public void executarPix(int valor, String chave) throws ErroDePix, IOException {
    Conexao conexao = servidor.abrirConexao();

    if (valor <= 0) {
      throw new ErroValorNaoPositivo();
    }
    if (chave.isBlank()) {
      throw new ErroChaveEmBranco();
    }

    servidor.abrirConexao();
    // servidor.abrirConexao().enviarPix(valor, chave);

    try {
      if (servidor.abrirConexao().enviarPix(valor, chave) == CodigosDeRetorno.SALDO_INSUFICIENTE) {
        throw new ErroSaldoInsuficiente();
      } else if (servidor.abrirConexao().enviarPix(valor,
          chave) == CodigosDeRetorno.CHAVE_PIX_NAO_ENCONTRADA) {
        throw new ErroChaveNaoEncontrada();
      } else if (servidor.abrirConexao().enviarPix(valor, chave) != CodigosDeRetorno.SUCESSO) {
        throw new ErroInterno();
      }
    } finally {
      conexao.close();
    }
  }
}
