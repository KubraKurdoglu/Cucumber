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

//Seneryoların nerede ve nasıl çalışacağı, hangi raporu kullanacağıyla alakalı seçenekleri ayarlarız
@CucumberOptions(plugin = {"pretty","html:src/test/resources/features/htmlReport/cucumbertc3.html",
                            "json:src/test/resources/features/htmlReport/cucumber.json",
                            "junit:src/test/resources/features/htmlReport/cucumber.xml"},


        //plugin parametresi ile pretty ifadesi kullanılırsa konsolda scenario'lar ile bilgi gösterir
        features = "src/test/resources/features",
        glue = {"techproed/stepDefinitions"},//Bu parametre ile kodlarımızı yazdığımız stepDefinition
        //class'ının packege'ını belirtiriz


        tags = "@tc3",
        dryRun = false,

        //dryRun=false Test adımlarını kontrol eder ve browser'ı çalıştırır
        //dryRun=True Test adımlarını sadece kontrol eder
        //default olarak false'tur

        monochrome = true//pretty ifadesinden sonra monochrome = true kullanırsak senerio adımlarını tekrenk olark siyah gösterir
        //monochrome = false kullanırsak renkli gösterir
        //default false
)

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
