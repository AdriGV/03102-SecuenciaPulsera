/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {
    public static void main (String[] args){
        //Constantes
        String PERSONA_CON_OREJAS = "Marta";
        double DINERO_INICIAL = 1.00;
        String COSA = "Pulsera hippy";
        double PRECIO_COSA = 0.70;
        
        //Variable
        double dineroRestante = DINERO_INICIAL - PRECIO_COSA;
        
        //Rotulo
        System.out.println("Secuencia de Pulsera");
        System.out.printf("==================== %n---%n");
        
        //Mensaje
        System.out.printf("Nombre de la niña ...: %s%n", PERSONA_CON_OREJAS);
        System.out.printf(Locale.ENGLISH,"Dinero inicial ......: %.2f €%n---%n", DINERO_INICIAL);
        System.out.printf("Artículo a comprar ..: %s%n", COSA);
        System.out.printf(Locale.ENGLISH,"Precio artículo .....: %.2f €%n---%n", PRECIO_COSA);
        System.out.printf(Locale.ENGLISH,"Dinero restante .....: %.2f €%n", dineroRestante);
    }
}
