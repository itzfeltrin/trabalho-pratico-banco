package entities.model;

import java.io.BufferedReader;
import java.util.ArrayList;

public class Sequencial {
    public ArrayList<Candidato> listaCand = new ArrayList<>();
    public Double tempo;
    
    public Sequencial(BufferedReader reader) {
        long tempoInicio = System.currentTimeMillis();  
        String line;
        try {
            reader.readLine();
            while((line = reader.readLine()) != null) {
                String[] linhas = line.split(";");                
                String cpf = linhas[20].replace("\"", "");
                String nome = linhas[17].replace("\"", "");
                Candidato auxCandidato = new Candidato(cpf, nome);
                this.listaCand.add(auxCandidato);
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }        
        this.tempo = (double) (System.currentTimeMillis() - tempoInicio) / 1000;
    }
    
    public String search(String cpf) {
        String text;
        long tempoInicio = System.currentTimeMillis();
        int aux = 0;
        try {
            for(Candidato obj : this.listaCand) {
                aux++;
                if(obj.CPF.equals(cpf)) {
                    Double auxTempo = (double) (System.currentTimeMillis() - tempoInicio);
                    text = "Candidato: " + obj.nome +
                           "\nPesquisas: " + (aux) + 
                           "\nTempo de carregamento: " + this.tempo + " segundos" +
                           "\nTempo de busca: " + auxTempo / 1000 + " segundos."; 
                    return text;
                }
            }       
        }
        catch(Exception ex) {                             
        }
        return "Registro não encontrado.";        
    }
}
