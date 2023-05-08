package techproed.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
Runner class; testNG'deki .xml file'larda belirttiğimiz class'ları, package'ları veya methodları nasıl
çalıştırıyorsak, Cucumber frameworkunde de Runner class'ındaki tags parametresi ile belirttiğimiz
senaryoyu çalıştırabiliriz.
 */


//Cucumber il eJUnit'in entegre olmasini saglayan test calistirci notasyonudur.
@RunWith(Cucumber.class)

//Senaryolarin nerede ve nasil calisacagi, hangi raporu kullanacagi ile alakali secenekleri ayarlariz.

@CucumberOptions(features = "src/test/resources/features/day30_IlkFaeture",
                  glue = {"techproed/stepDefinitions"},//bu parametre ile kodlarimizi yazdigimiz stepdefinition
                                                      //class'inin package'ini belirtiriz
        tags = "@gr1")

/*
        features ===> features'ların olduğu package yolunu ver(ContentRoot)
        glue ====> stepDefinition'ların olduğu package yolunu ver(Source Root)
        tags ====> çalıştırmak istediğin grubu yaz
 */


//tags'lerde benzer ada sahip tag'lerden hangisinin calisacgaini belirlemek icin "and" ve "or" kullaniriz
//ornegin hem "sqla" hem "gr1" tagina sahip olani calistirmak istersek "@gr1 and @sql" kullanmaliyiz.

//mesela gr3 ve gr2 nin calismasini istiyorsak==> @gr3 or @gr2 dememiz lazim
// yada mesela senaryosu hem @gr1 hemde @sql'e sahip olsun diyorsak, @gr1 and @sql yazmamiz lazim

public class Runner {


}
