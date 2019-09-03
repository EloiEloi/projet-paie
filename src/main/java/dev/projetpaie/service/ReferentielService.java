package dev.projetpaie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.projetpaie.dto.ReferentielDto;

@Service
public class ReferentielService {

        @Autowired
        private EntrepriseService entrepriseService;
        @Autowired
        private ProfilRemunerationService profilRemunerationService;
        @Autowired
        private GradeService gradeService;

        /**
         * @param entrepriseService
         * @param profilRemunerationService
         * @param gradeService
         */

        public ReferentielService(EntrepriseService entrepriseService,
                        ProfilRemunerationService profilRemunerationService, GradeService gradeService) {
                this.entrepriseService = entrepriseService;
                this.profilRemunerationService = profilRemunerationService;
                this.gradeService = gradeService;
        }

        public ReferentielDto recupererListeEntrepriseDtoEtGradeDtoEtProfilRemunerationDto() {

                return new ReferentielDto(entrepriseService.recupererListeEntreprisesDto(),
                                gradeService.recupererListeGradesDto(),
                                profilRemunerationService.recupererlisteProfilRemuneration());

        }

}