Feature: US003_TechProEducation_Testi
  Background: Kullanici TechproEducation Sayfasina Gider
    Given kullanici_techpro_sayfasina_gider

    #https://techproeducation.com yerine .properties dosyasındaki key'de kullanılabilir
#Eğer .properties dosyasındaki key(url)'i kullanmak istersek, stepDefinition class'ımızda parametre
#istenen yere ConfigReader.getProperty(Key) methodu ile giriş yapmalıyız

    #hoca yukariya techpro nun adresini yazdi fakat bende o sekilde calismadi
  #bir de arama kutusuna qa ve deloper yazmadi, locate'i degistirin dedi hoca

  Scenario: TC01_TechProEducation_Sayfasi_Testi
    Then cikan_reklam_kapatilir
    When kullanici 2 saniye bekler
    And kullanici_tum_sayfanin_resmini_alir
    And arama_kutusunda_QA_aratir
    Then kullanici 2 saniye bekler
    And sayfa_basliginin_qa_icerdigini_test_eder
    When kullanici_tum_sayfanin_resmini_alir
    And sayfayi_kapatir

    Scenario: TC02_TechProEducation_Sayfasi_Testi
      And cikan_reklam_kapatilir
      And kullanici 2 saniye bekler
      And searchBoxda_"developer"_aratir
      And sayfa_basliginin_"developer"_icerdigini_test_eder
      When kullanici_tum_sayfanin_resmini_alir
      And sayfayi_kapatir