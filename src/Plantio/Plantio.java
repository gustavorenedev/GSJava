package Plantio;

import Agricultor.Agricultor;

public class Plantio {
	private String alimento;
	private Agricultor regiao;
	
	public Plantio(String alimento, Agricultor regiao) {
		this.alimento = alimento;
		this.regiao = regiao;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public Agricultor getRegiao() {
		return regiao;
	}

	public void setRegiao(Agricultor regiao) {
		this.regiao = regiao;
	}
	
	public static void mostrarAlimentos(int regiao) {
	    String nomeRegiao = "";

	    switch (regiao) {
	        case 1:
	            nomeRegiao = "Norte";
	            System.out.println("Alimentos recomendados para a região " + nomeRegiao + ":\n");
	            System.out.println("1. Alface (30 a 45 dias para colher)");
	            System.out.println("2. Rúcula (30 a 45 dias para colher)");
	            System.out.println("3. Coentro (30 a 45 dias para colher)");
	            System.out.println("4. Cebolinha (30 a 45 dias para colher)");
	            System.out.println("5. Pimentão (60 a 90 dias para colher)");
	            System.out.println("6. Abóbora (70 a 90 dias para colher)");
	            System.out.println("7. Quiabo (60 a 80 dias para colher)");
	            System.out.println("8. Melancia (80 a 100 dias para colher)");
	            System.out.println("9. Pepino (50 a 70 dias para colher)");
	            System.out.println("10. Feijão (60 a 90 dias para colher)");
	            break;
	        case 2:
	            nomeRegiao = "Nordeste";
	            System.out.println("Alimentos recomendados para a região " + nomeRegiao + ":\n");
	            System.out.println("1. Melancia (80 a 100 dias para colher)");
	            System.out.println("2. Mamão (90 a 120 dias para colher)");
	            System.out.println("3. Abacaxi (12 a 24 meses para colher)");
	            System.out.println("4. Coentro (30 a 45 dias para colher)");
	            System.out.println("5. Alface (30 a 45 dias para colher)");
	            System.out.println("6. Rúcula (30 a 45 dias para colher)");
	            System.out.println("7. Cebolinha (30 a 45 dias para colher)");
	            System.out.println("8. Tomate (60 a 80 dias para colher)");
	            System.out.println("9. Abóbora (70 a 90 dias para colher)");
	            System.out.println("10. Pimentão (60 a 90 dias para colher)");

	            break;
	        case 3:
	            nomeRegiao = "Sul";
	            System.out.println("Alimentos recomendados para a região " + nomeRegiao + ":\n");
	            System.out.println("1. Maçã (12 a 18 meses para colher)");
	            System.out.println("2. Pera (12 a 18 meses para colher)");
	            System.out.println("3. Ameixa (12 a 18 meses para colher)");
	            System.out.println("4. Batata (90 a 120 dias para colher)");
	            System.out.println("5. Cenoura (70 a 90 dias para colher)");
	            System.out.println("6. Repolho (70 a 90 dias para colher)");
	            System.out.println("7. Beterraba (60 a 80 dias para colher)");
	            System.out.println("8. Tomate (60 a 80 dias para colher)");
	            System.out.println("9. Alface (40 a 60 dias para colher)");
	            System.out.println("10. Abóbora (90 a 110 dias para colher)");

	            break;
	        case 4:
	            nomeRegiao = "Sudeste";
	            System.out.println("Alimentos recomendados para a região " + nomeRegiao + ":\n");
	            System.out.println("1. Banana (9 a 12 meses para colher)");
	            System.out.println("2. Abacaxi (18 a 24 meses para colher)");
	            System.out.println("3. Manga (12 a 18 meses para colher)");
	            System.out.println("4. Feijão (60 a 90 dias para colher)");
	            System.out.println("5. Milho (90 a 120 dias para colher)");
	            System.out.println("6. Tomate (60 a 80 dias para colher)");
	            System.out.println("7. Alface (40 a 60 dias para colher)");
	            System.out.println("8. Cenoura (70 a 90 dias para colher)");
	            System.out.println("9. Couve (60 a 80 dias para colher)");
	            System.out.println("10. Pimentão (70 a 90 dias para colher)");
	            break;
	        case 5:
	            nomeRegiao = "Centro-Oeste";
	            System.out.println("Alimentos recomendados para a região " + nomeRegiao + ":\n");
	            System.out.println("1. Melancia (70 a 90 dias para colher)");
	            System.out.println("2. Abóbora (90 a 120 dias para colher)");
	            System.out.println("3. Maracujá (12 a 18 meses para colher)");
	            System.out.println("4. Feijão (60 a 90 dias para colher)");
	            System.out.println("5. Mandioca (12 a 18 meses para colher)");
	            System.out.println("6. Tomate (60 a 80 dias para colher)");
	            System.out.println("7. Cebolinha (40 a 60 dias para colher)");
	            System.out.println("8. Pimenta (90 a 120 dias para colher)");
	            System.out.println("9. Quiabo (60 a 80 dias para colher)");
	            System.out.println("10. Berinjela (90 a 120 dias para colher)");
	            break;
	        default:
	            System.out.println("Região inválida.");
	            return;
	    }
	}
	
    public static void mostrarDicasPlantio(int regiao, int opcaoAlimento) {
        String nomeRegiao = "";
        String alimento = "";

        switch (regiao) {
            case 1:
                nomeRegiao = "Norte";
                switch (opcaoAlimento) {
                    case 1:
                        alimento = "Alface";
                        System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                        System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 20 cm entre cada planta.\n"
                        		+ "Água: Mantenha o solo sempre úmido, regando regularmente.\n"
                        		+ "Colheita: Aproximadamente 30 a 45 dias após o plantio. Colha as folhas externas conforme necessário.");
                        break;
                    case 2:
                        alimento = "Rúcula";
                        System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                        System.out.println("Solo: Solo fértil e drenado.\n"
                        		+ "Distância de plantio: Cerca de 15 cm entre cada planta.\n"
                        		+ "Água: Mantenha o solo levemente úmido, regando regularmente.\n"
                        		+ "Colheita: Aproximadamente 30 a 45 dias após o plantio. Corte as folhas externas conforme necessário.");
                        break;
                    case 3:
                        alimento = "Coentro";
                        System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                        System.out.println("Solo: Solo rico em matéria orgânica.\n"
                        		+ "Distância de plantio: Cerca de 15 cm entre cada planta.\n"
                        		+ "Água: Regue regularmente para manter o solo úmido, mas evite encharcamento.\n"
                        		+ "Colheita: Aproximadamente 30 a 45 dias após o plantio. Corte as folhas externas quando atingirem o tamanho desejado.");
                        break;
                    case 4:
                        alimento = "Cebolinha";
                        System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                        System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 10 cm entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                        		+ "Colheita: Aproximadamente 30 a 45 dias após o plantio. Corte as folhas externas conforme necessário.");
                        break;
                    case 5:
                        alimento = "Pimentão";
                        System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                        System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 40 cm a 60 cm entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo levemente úmido.\n"
                        		+ "Colheita: Aproximadamente 60 a 90 dias após o plantio. Colha os pimentões quando atingirem o tamanho desejado e estiverem firmes.");
                        break;
                    case 6:
                        alimento = "Abóbora";
                        System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                        System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 1 metro entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                        		+ "Colheita: Aproximadamente 70 a 90 dias após o plantio. Colha as abóboras quando estiverem totalmente maduras e a casca estiver dura.");
                        break;
                    case 7:
                        alimento = "Quiabo";
                        System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                        System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 30 cm a 40 cm entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo levemente úmido.\n"
                        		+ "Colheita: Aproximadamente 60 a 80 dias após o plantio. Colha os quiabos quando estiverem jovens e tenros.");
                        break;
                    case 8:
                        alimento = "Melancia";
                        System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                        System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 1 metro a 2 metros entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo levemente úmido.\n"
                        		+ "Colheita: Aproximadamente 80 a 100 dias após o plantio. Colha as melancias quando a casca estiver dura e o som oco ao bater.");
                        break;
                    case 9:
                        alimento = "Pepino";
                        System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                        System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 40 cm entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                        		+ "Colheita: Aproximadamente 50 a 70 dias após o plantio. Colha os pepinos quando atingirem o tamanho desejado e tiverem cor uniforme.");
                        break;
                    case 10:
                        alimento = "Feijão";
                        System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                        System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 10 cm a 15 cm entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                        		+ "Colheita: Aproximadamente 60 a 90 dias após o plantio. Colha as vagens quando estiverem maduras, mas antes de secarem completamente.");
                        break;
                }
                break;
            case 2:
                nomeRegiao = "Nordeste";
                switch (opcaoAlimento) {
	                case 1:
	                    alimento = "Melancia";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 1 metro a 2 metros entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo levemente úmido.\n"
                        		+ "Colheita: Aproximadamente 80 a 100 dias após o plantio. Colha as melancias quando a casca estiver dura e o som oco ao bater.");
	                    break;
	                case 2:
	                    alimento = "Mamão";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 2 metros entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 8 a 12 meses após o plantio. Colha o mamão quando a casca estiver amarela e macia ao toque.");
	                    break;
	                case 3:
	                    alimento = "Abacaxi";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 1 metro a 1,5 metros entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 18 a 24 meses após o plantio. Colha o abacaxi quando a casca estiver dourada e o aroma for adocicado.");
	                    break;
	                case 4:
	                    alimento = "Coentro";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo rico em matéria orgânica.\n"
                        		+ "Distância de plantio: Cerca de 15 cm entre cada planta.\n"
                        		+ "Água: Regue regularmente para manter o solo úmido, mas evite encharcamento.\n"
                        		+ "Colheita: Aproximadamente 30 a 45 dias após o plantio. Corte as folhas externas quando atingirem o tamanho desejado.");
	                    break;
	                case 5:
	                    alimento = "Alface";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 20 cm entre cada planta.\n"
                        		+ "Água: Mantenha o solo sempre úmido, regando regularmente.\n"
                        		+ "Colheita: Aproximadamente 30 a 45 dias após o plantio. Colha as folhas externas conforme necessário.");
	                    break;
	                case 6:
	                    alimento = "Rúcula";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e drenado.\n"
                        		+ "Distância de plantio: Cerca de 15 cm entre cada planta.\n"
                        		+ "Água: Mantenha o solo levemente úmido, regando regularmente.\n"
                        		+ "Colheita: Aproximadamente 30 a 45 dias após o plantio. Corte as folhas externas conforme necessário.");
	                    break;
	                case 7:
	                    alimento = "Cebolinha";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 10 cm entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                        		+ "Colheita: Aproximadamente 30 a 45 dias após o plantio. Corte as folhas externas conforme necessário.");
	                    break;
	                case 8:
	                    alimento = "Tomate";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 50 cm a 80 cm entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 60 a 80 dias após o plantio. Colha os tomates quando estiverem firmes e com a cor desejada.");
	                    break;
	                case 9:
	                    alimento = "Abóbora";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 1 metro entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                        		+ "Colheita: Aproximadamente 70 a 90 dias após o plantio. Colha as abóboras quando estiverem totalmente maduras e a casca estiver dura.");
	                    break;
	                case 10:
	                    alimento = "Pimentão";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 40 cm a 60 cm entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo levemente úmido.\n"
                        		+ "Colheita: Aproximadamente 60 a 90 dias após o plantio. Colha os pimentões quando atingirem o tamanho desejado e estiverem firmes.");
	                    break;
                }
                break;
            case 3:
                nomeRegiao = "Sul";
                switch (opcaoAlimento) {
	                case 1:
	                    alimento = "Maçã";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 4 metros a 6 metros entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 3 a 5 anos após o plantio, dependendo da variedade. Colha as maçãs quando a cor estiver uniforme e a polpa estiver firme.");
	                    break;
	                case 2:
	                    alimento = "Pera";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 4 metros a 6 metros entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 3 a 5 anos após o plantio, dependendo da variedade. Colha as peras quando a cor estiver uniforme e a polpa estiver macia.");
	                    break;
	                case 3:
	                    alimento = "Ameixa";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 4 metros a 6 metros entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 3 a 4 anos após o plantio, dependendo da variedade. Colha as ameixas quando estiverem maduras e com a cor desejada.");
	                    break;
	                case 4:
	                    alimento = "Batata";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo leve e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 30 cm entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 80 a 100 dias após o plantio. Colha as batatas quando as folhas estiverem secas e murchas.");
	                    break;
	                case 5:
	                    alimento = "Cenoura";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo leve e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 10 cm a 15 cm entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 70 a 80 dias após o plantio. Colha as cenouras quando atingirem o tamanho desejado e a cor estiver brilhante.");
	                    break;
	                case 6:
	                    alimento = "Repolho";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 30 cm a 40 cm entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 70 a 100 dias após o plantio. Colha o repolho quando a cabeça estiver firme e compacta.");
	                    break;
	                case 7:
	                    alimento = "Beterraba";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 10 cm a 15 cm entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 60 a 80 dias após o plantio. Colha as beterrabas quando atingirem o tamanho desejado e estiverem com a cor vibrante.");
	                    break;
	                case 8:
	                    alimento = "Tomate";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 50 cm a 80 cm entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 60 a 80 dias após o plantio. Colha os tomates quando estiverem firmes e com a cor desejada.");
	                    break;
	                case 9:
	                    alimento = "Alface";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 20 cm entre cada planta.\n"
                        		+ "Água: Mantenha o solo sempre úmido, regando regularmente.\n"
                        		+ "Colheita: Aproximadamente 30 a 45 dias após o plantio. Colha as folhas externas conforme necessário.");
	                    break;
	                case 10:
	                    alimento = "Abóbora";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 1 metro entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                        		+ "Colheita: Aproximadamente 70 a 90 dias após o plantio. Colha as abóboras quando estiverem totalmente maduras e a casca estiver dura.");
	                    break;
                }
                break;
            case 4:
                nomeRegiao = "Sudeste";
                switch (opcaoAlimento) {
	                case 1:
	                    alimento = "Banana";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 2 metros a 3 metros entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 9 a 12 meses após o plantio. Colha as bananas quando estiverem maduras e com a cor amarela.");
	                    break;
	                case 2:
	                    alimento = "Abacaxi";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 1 metro a 1,5 metros entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 18 a 24 meses após o plantio. Colha o abacaxi quando a casca estiver dourada e o aroma for adocicado.");
	                    break;
	                case 3:
	                    alimento = "Manga";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 5 metros a 7 metros entre cada planta.\n"
	                    		+ "Água: Regue regularmente, especialmente durante a época de crescimento.\n"
	                    		+ "Colheita: Aproximadamente 3 a 6 anos após o plantio, dependendo da variedade. Colha as mangas quando a cor estiver vibrante e a polpa estiver macia.");
	                    break;
	                case 4:
	                    alimento = "Feijão";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 10 cm a 15 cm entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                        		+ "Colheita: Aproximadamente 60 a 90 dias após o plantio. Colha as vagens quando estiverem maduras, mas antes de secarem completamente.");
	                    break;
	                case 5:
	                    alimento = "Milho";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 20 cm a 30 cm entre cada planta.\n"
	                    		+ "Água: Regue regularmente, especialmente durante a fase de crescimento.\n"
	                    		+ "Colheita: Aproximadamente 60 a 90 dias após o plantio. Colha o milho quando as espigas estiverem bem formadas e os grãos estiverem maduros.");
	                    break;
	                case 6:
	                    alimento = "Tomate";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 50 cm a 80 cm entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 60 a 80 dias após o plantio. Colha os tomates quando estiverem firmes e com a cor desejada.");
	                    break;
	                case 7:
	                    alimento = "Alface";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 20 cm entre cada planta.\n"
                        		+ "Água: Mantenha o solo sempre úmido, regando regularmente.\n"
                        		+ "Colheita: Aproximadamente 30 a 45 dias após o plantio. Colha as folhas externas conforme necessário.");
	                    break;
	                case 8:
	                    alimento = "Cenoura";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo leve e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 5 cm a 10 cm entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 60 a 80 dias após o plantio. Colha as cenouras quando atingirem o tamanho desejado e a cor estiver brilhante.");
	                    break;
	                case 9:
	                    alimento = "Couve";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
	                    		+ "Distância de plantio: Cerca de 40 cm a 60 cm entre cada planta.\n"
	                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
	                    		+ "Colheita: Aproximadamente 60 a 90 dias após o plantio. Colha as folhas externas da couve quando estiverem grandes o suficiente para uso.");
	                    break;
	                case 10:
	                    alimento = "Pimentão";
	                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
	                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                        		+ "Distância de plantio: Cerca de 40 cm a 60 cm entre cada planta.\n"
                        		+ "Água: Regue regularmente, mantendo o solo levemente úmido.\n"
                        		+ "Colheita: Aproximadamente 60 a 90 dias após o plantio. Colha os pimentões quando atingirem o tamanho desejado e estiverem firmes.");
	                    break;
                }
                break;
            case 5:
                nomeRegiao = "Centro-Oeste";
                switch (opcaoAlimento) {
                case 1:
                    alimento = "Melancia";
                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                    		+ "Distância de plantio: Cerca de 1 metro a 2 metros entre cada planta.\n"
                    		+ "Água: Regue regularmente, mantendo o solo levemente úmido.\n"
                    		+ "Colheita: Aproximadamente 80 a 100 dias após o plantio. Colha as melancias quando a casca estiver dura e o som oco ao bater.");
                    break;
                case 2:
                    alimento = "Abóbora";
                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                    		+ "Distância de plantio: Cerca de 1 metro entre cada planta.\n"
                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                    		+ "Colheita: Aproximadamente 70 a 90 dias após o plantio. Colha as abóboras quando estiverem totalmente maduras e a casca estiver dura.");
                    break;
                case 3:
                    alimento = "Maracujá";
                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                    		+ "Distância de plantio: Cerca de 2 metros a 3 metros entre cada planta.\n"
                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                    		+ "Colheita: Aproximadamente 12 a 18 meses após o plantio. Colha o maracujá quando a casca estiver enrugada e a fruta estiver levemente macia ao toque.");
                    break;
                case 4:
                    alimento = "Feijão";
                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                    		+ "Distância de plantio: Cerca de 10 cm a 15 cm entre cada planta.\n"
                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                    		+ "Colheita: Aproximadamente 60 a 90 dias após o plantio. Colha as vagens quando estiverem maduras, mas antes de secarem completamente.");
                    break;
                case 5:
                    alimento = "Mandioca";
                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                    		+ "Distância de plantio: Cerca de 1 metro a 1,5 metros entre cada planta.\n"
                    		+ "Água: Regue regularmente, especialmente durante o primeiro ano de crescimento.\n"
                    		+ "Colheita: Aproximadamente 8 a 12 meses após o plantio. Colha as raízes quando as folhas começarem a amarelar e secar.");
                    break;
                case 6:
                    alimento = "Tomate";
                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                    		+ "Distância de plantio: Cerca de 50 cm a 80 cm entre cada planta.\n"
                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                    		+ "Colheita: Aproximadamente 60 a 80 dias após o plantio. Colha os tomates quando estiverem firmes e com a cor desejada.");
                    break;
                case 7:
                    alimento = "Cebolinha";
                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                    		+ "Distância de plantio: Cerca de 10 cm entre cada planta.\n"
                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                    		+ "Colheita: Aproximadamente 30 a 45 dias após o plantio. Corte as folhas externas conforme necessário.");
                    break;
                case 8:
                    alimento = "Pimenta";
                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                    		+ "Distância de plantio: Cerca de 40 cm a 60 cm entre cada planta.\n"
                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                    		+ "Colheita: Aproximadamente 60 a 90 dias após o plantio. Colha as pimentas quando atingirem o tamanho desejado e a cor estiver vibrante.");
                    break;
                case 9:
                    alimento = "Quiabo";
                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                    		+ "Distância de plantio: Cerca de 30 cm a 40 cm entre cada planta.\n"
                    		+ "Água: Regue regularmente, mantendo o solo levemente úmido.\n"
                    		+ "Colheita: Aproximadamente 60 a 80 dias após o plantio. Colha os quiabos quando estiverem jovens e tenros.");
                    break;
                case 10:
                    alimento = "Berinjela";
                    System.out.println("Dicas de plantio para " + alimento + " na região " + nomeRegiao + ":");
                    System.out.println("Solo: Solo fértil e bem drenado.\n"
                    		+ "Distância de plantio: Cerca de 60 cm a 90 cm entre cada planta.\n"
                    		+ "Água: Regue regularmente, mantendo o solo úmido.\n"
                    		+ "Colheita: Aproximadamente 60 a 80 dias após o plantio. Colha as berinjelas quando estiverem brilhantes, firmes e com a cor desejada.");
                    break;
                }
                break;
        }
    }
}
