package br.com.fiap.mains;

import br.com.fiap.beans.*;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        Linha objLinha = new Linha(
                inteiro("Inisira o ID da Linha (sugestão: 1)"),
                texto("Insira o nome da Linha (sugestão: Linha Amarela)")
        );

        Estacao objEstacaoOrigem = new Estacao(
                inteiro("Insira o ID da Estação de Origem (sugestão: 1)"),
                texto("Insira o nome da Estação de Origem (sugestão: Estação da Luz)"),
                texto("Insira a hora de abertura da Estação de Origem (sugestão: 05:00)"),
                texto("Insira a hora de fechamento da Estação de Origem (sugestão: 01:00)")
        );

        objEstacaoOrigem.setLinha(objLinha);

        Estacao objEstacaoDestino = new Estacao(
                inteiro("Insira o ID da Estação de Destino (sugestão: 2)"),
                texto("Insira o nome da Estação de Destino (sugestão: Estação Faria Lima)"),
                texto("Insira a hora de abertura da Estação de Destino (sugestão: 05:00)"),
                texto("Insira a hora de fechamento da Estação de Fechamento (sugestão: 01:00)")
        );

        objEstacaoDestino.setLinha(objLinha);

        Alerta objAlerta = new Alerta(
                inteiro("Insira o ID do Alerta (sugestão: 1)"),
                texto("Insira o Título do Alerta (sugestão: Trem Pegando Fogo)"),
                texto("Insira o Descrição do Alerta (sugestão: Trem está pegando fogo)"),
                texto("Insira a Data e a Hora de ínicio do Alerta (sugestão: 04/11/2024 18:12)"),
                texto("Insira a Data e a Hora de término do Alerta (sugestão: 04/11/2024 22:49)"),
                inteiro("Insira a Gravidade do Alerta (sugestão: 5)")
        );

        objAlerta.setEstacao(objEstacaoOrigem);

        Trem objTrem = new Trem(
                inteiro("Insira o ID do trem (sugestão: 1)"),
                texto("Insira o Código de Identificação do trem (sugestão: XPTO-44)"),
                texto("Insira o Status do trem (sugestão: Operando)")
        );

        objTrem.setLinha(objLinha);
        objTrem.setUltimaEstacao(objEstacaoOrigem);

        Rota objRota = new Rota(
                inteiro("Insira o ID da Rota (sugestão: 1)"),
                real("Insira a Distância da Rota (sugestão: 67.32)"),
                real("Insira a Velocidade Média da Rota (sugestão: 45)")
        );

        objRota.setEstacaoOrigem(objEstacaoOrigem);
        objRota.setEstacaoDestino(objEstacaoDestino);

        Localizacao objLocalizacao = new Localizacao(
                inteiro("Insira o ID da Localização (sugestão: 1)"),
                real("Insira a Latitude da Localização (sugestão: 12.5)"),
                real("Insira a Longitude da Localização (sugestão: 67.33)")
        );

        PontoInteresse objPontoInteresse = new PontoInteresse(
                inteiro("Insira o ID do Ponto de Interesse (sugestão: 1)"),
                texto("Insira o Nome do Ponto de Interesse (sugestão: Banheiro Masculino)"),
                texto("Insira o Tipo do Ponto de Interesse (sugestão: Banheiro)"),
                texto("Insira a Descrição do Ponto de Interesse (sugestão: Fica ao lado da entrada da estação da luz)")
        );

        objPontoInteresse.setEstacao(objEstacaoOrigem);
        objPontoInteresse.setLocalizacao(objLocalizacao);

        QRCode objQRCode = new QRCode(
                inteiro("Insira o ID do QRCode (sugestão: 1)"),
                texto("Insira o Código do QRCode (sugestão: LUZ-1536)"),
                texto("Insira a Descrição do QRCode (sugestão: Código da entrada sul da estação da luz)")
        );

        objQRCode.setEstacao(objEstacaoOrigem);
        objQRCode.setLocalizacao(objLocalizacao);

        Usuario objUsuario = new Usuario(
                inteiro("Insira o ID do Usuário (sugestão: 1)"),
                texto("Insira o Nome do Usuário (sugestão: Braufragelio)"),
                texto("Insira o Email do Usuário (sugestão: braumail@email.com)"),
                texto("Insira a Data de Criação do Usuário (sugestão: 01/10/2024)"),
                texto("Insira a Data da Ultíma Alteração do Usuário (sugestão: 04/11/2024)")
        );

        Conversa objConversa = new Conversa(
                inteiro("Insira o ID da Conversa (sugestão: 1)"),
                texto("Insira o Título da Conversa (sugestão: Localização do Banheiro na Estação Luz)"),
                texto("Insira a Data e a Hora da Criação da Conversa (sugestão: 13/10/2024 14:29)")
        );

        Mensagem objMensagem = new Mensagem(
                inteiro("Insira o ID da Mensagem (sugestão: 1)"),
                texto("Insira o Horário da Mensagem (sugestão: 14:29)"),
                texto("Insira o Conteúdo da Mensagem (sugestão: Onde fica o banheiro masculino na estação da luz?)"),
                texto("Insira a Resposta da Mensagem (sugestão: O banheiro masculino fica ao lado da entrada da estação)")
        );

        objMensagem.setUsuario(objUsuario);
        objMensagem.setConversa(objConversa);

        System.out.println(objLinha);
        System.out.println(objEstacaoOrigem);
        System.out.println(objEstacaoDestino);
        System.out.println(objAlerta);
        System.out.println(objTrem);
        System.out.println(objRota);
        System.out.println(objLocalizacao);
        System.out.println(objPontoInteresse);
        System.out.println(objQRCode);
        System.out.println(objUsuario);
        System.out.println(objConversa);
        System.out.println(objMensagem);

        System.out.println("Exibição do Alerta:\n" + objAlerta.exibirAlerta());

        System.out.println("Tempo de Viagem da Rota: " + objRota.calcularTempoViagem() + "hrs");

    }
}
