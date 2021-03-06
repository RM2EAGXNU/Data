//package spring;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import spring.net.mydream.entity.*;
//import spring.net.mydream.service.*;
//import spring.net.mydream.utils.PreconditionException;
//
//import java.util.List;
//
//@SpringBootTest
//public class EatCode {
//
//    @Autowired
//    private CustomerService customerService;
//    @Autowired
//    private EatSystem eatSystem;
//    @Autowired
//    private EvaluationService evaluationService;
//
//    @Autowired
//    private OrderService orderService;
//    @Autowired
//    private StoreService storeService;
//
//
//
//
//
//    @Test
//    void getByPhone()  {
//        //---------------------------------------------------
//        Customer a1 = null;
//        try {
//
//            a1 = customerService.getByPhone("135555");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void getByPhone2()  {
//        //---------------------------------------------------
//        Customer a1 = null;
//        try {
//
//            a1 = customerService.getByPhone("135555666");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void getByName()  {
//        //---------------------------------------------------
//        Customer a1 = null;
//        try {
//
//            a1 = customerService.getByName("zhc");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void getByName2()  {
//        //---------------------------------------------------
//        Customer a1 = null;
//        try {
//
//            a1 = customerService.getByName("zhc111");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void loginByPhone()  {
//        //---------------------------------------------------
//        Boolean a1 = false;
//        try {
//
//            a1 = customerService.loginByPhone("135555","12345");
//        } catch (Exception e) {
////            e.printStackTrace();
////            a1 = null ;
//            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void loginByPhone2()  {
//        //---------------------------------------------------
//        Boolean a1 = false;
//        try {
//
//            a1 = customerService.loginByPhone("135555","123456789");
//        } catch (Exception e) {
////            e.printStackTrace();
////            a1 = null ;
//            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void toEvaluationCheck()  {
//        //---------------------------------------------------
//        List<Evaluation> a1 = null;
//        try {
//
//            a1 = evaluationService.toEvaluationCheck();
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void toEvaluationCheck2()  {
//        //------------------?????????????????????????????????---------------------------------
//        List<Evaluation> a1 = null;
//        try {
//
//            a1 = evaluationService.toEvaluationCheck();
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void submitEvaluation2()  {
//        //------------------?????????????????????????????????---------------------------------
//        Boolean a1 = false;
//        try {
//
//            a1 = evaluationService.submitEvaluation2(1,1,"??????");
//        } catch (Exception e) {
////            e.printStackTrace();
////            a1 = null ;
//            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void submitEvaluation22()  {
//        //------------------?????????????????????????????????---------------------------------
//        Boolean a1 = false;
//        try {
//
//            a1 = evaluationService.submitEvaluation2(1,2,"??????");
//        } catch (Exception e) {
////            e.printStackTrace();
////            a1 = null ;
//            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//
//    @Test
//    void toEvaluateOrdering()  {
//
//        Ordering a1 = null;
//        try {
//
//            a1 = evaluationService.toEvaluateOrdering(1);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void toEvaluateOrdering2()  {
//
//        Ordering a1 = null;
//        try {
//
//            a1 = evaluationService.toEvaluateOrdering(100);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void toEvaluateStore()  {
//
//        Store a1 = null;
//        try {
//
//            a1 = evaluationService.toEvaluateStore(1);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void toEvaluateStore2()  {
//
//        Store a1 = null;
//        try {
//
//            a1 = evaluationService.toEvaluateStore(100);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void Ordering()  {
//
//        Ordering a1 = null;
//        try {
//
//            a1 = orderService.selectOne(1);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void Ordering2()  {
//
//        Ordering a1 = null;
//        try {
//
//            a1 = orderService.selectOne(100);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//
//    @Test
//    void deliveryConfirmine()  {
//
//        Boolean a1 = false;
//        try {
//
//            a1 = orderService.deliveryConfirmine(1);
//        } catch (Exception e) {
////            e.printStackTrace();
////            a1 = null ;
//            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void deliveryConfirmine2()  {
//
//        Boolean a1 = false;
//        try {
//
//            a1 = orderService.deliveryConfirmine(100);
//        } catch (Exception e) {
////            e.printStackTrace();
////            a1 = null ;
//            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//
//    @Test
//    void search()  {
//
//        List<Store> a1 = null;
//        try {
//
//            a1 = storeService.search("store");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void search2()  {
//
//        List<Store> a1 = null;
//        try {
//
//            a1 = storeService.search("store1111");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//
//    @Test
//    void suggestByStr()  {
//
//        List<Store> a1 = null;
//        try {
//
//            a1 = storeService.suggestByStr("store");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void suggestByStr2()  {
//
//        List<Store> a1 = null;
//        try {
//
//            a1 = storeService.suggestByStr("store1111");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void enterStoreBystoreId()  {
//
//        List<Evaluation> a1 = null;
//        try {
//
//            a1 = storeService.enterStoreBystoreId(1);
//        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void enterStoreBystoreId2()  {
//
//        List<Evaluation> a1 = null;
//        try {
//
//            a1 = storeService.enterStoreBystoreId(1000);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void enterStoreBystoreId2_dish()  {
//
//        List<Dishes> a1 = null;
//        try {
//
//            a1 = storeService.enterStoreBystoreId2(1);
//        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void enterStoreBystoreId2_dish2()  {
//
//        List<Dishes> a1 = null;
//        try {
//
//            a1 = storeService.enterStoreBystoreId2(1000);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void toStreet()  {
//
//        List<Store> a1 = null;
//        try {
//
//            a1 = storeService.toStreet();
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void toStreet2()  {
//        //------------------------????????????store???---------------------------
//        List<Store> a1 = null;
//        try {
//
//            a1 = storeService.toStreet();
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createOrdering()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.createOrdering(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createOrdering2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            //?????????id???1???User??????
//            a2 = eatSystem.createOrdering(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryOrdering()  {
//
//        //????????????
//        //---------------------------------------------------
//        Ordering a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"??????5",4000).thenReturn(true);
//            a2 = eatSystem.queryOrdering(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryOrdering2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Ordering a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = eatSystem.queryOrdering(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyOrdering()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.modifyOrdering(100,"shandong");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyOrdering2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.modifyOrdering(1,"shandong");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteOrdering()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.deleteOrdering(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteOrdering2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.deleteOrdering(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createStore()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.createStore(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createStore2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            //?????????id???1???User??????
//            a2 = eatSystem.createStore(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryStore()  {
//
//        //????????????
//        //---------------------------------------------------
//        Store a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"??????5",4000).thenReturn(true);
//            a2 = eatSystem.queryStore(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryStore2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Store a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = eatSystem.queryStore(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyStore()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.modifyStore(100,"guilin","?????????");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyStore2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.modifyStore(1,"guilin","?????????");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteStore()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.deleteStore(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteStore2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.deleteStore(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createDishes()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.createDishes(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createDishes2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            //?????????id???1???User??????
//            a2 = eatSystem.createDishes(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryDishes()  {
//
//        //????????????
//        //---------------------------------------------------
//        Dishes a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"??????5",4000).thenReturn(true);
//            a2 = eatSystem.queryDishes(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryDishes2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Dishes a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = eatSystem.queryDishes(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyDishes()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.modifyDishes(100,"??????");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyDishes2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.modifyDishes(1,"??????");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteDishes()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.deleteDishes(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteDishes2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.deleteDishes(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createCustomer()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.createCustomer(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createCustomer2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            //?????????id???1???User??????
//            a2 = eatSystem.createCustomer(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryCustomer()  {
//
//        //????????????
//        //---------------------------------------------------
//        Customer a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"??????5",4000).thenReturn(true);
//            a2 = eatSystem.queryCustomer(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryCustomer2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Customer a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = eatSystem.queryCustomer(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyCustomer()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.modifyCustomer(100,"yucai");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyCustomer2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.modifyCustomer(1,"yucai");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteCustomer()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.deleteCustomer(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteCustomer2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.deleteCustomer(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createEvaluation()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.createEvaluation(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createEvaluation2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            //?????????id???1???User??????
//            a2 = eatSystem.createEvaluation(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryEvaluation()  {
//
//        //????????????
//        //---------------------------------------------------
//        Evaluation a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"??????5",4000).thenReturn(true);
//            a2 = eatSystem.queryEvaluation(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryEvaluation2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Evaluation a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = eatSystem.queryEvaluation(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyEvaluation()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.modifyEvaluation(100,"yucai");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyEvaluation2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.modifyEvaluation(1,"yucai");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteEvaluation()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.deleteEvaluation(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteEvaluation2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.deleteEvaluation(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createOrderingDishes()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.createOrderingDishes(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createOrderingDishes2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            //?????????id???1???User??????
//            a2 = eatSystem.createOrderingDishes(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryOrderingDishes()  {
//
//        //????????????
//        //---------------------------------------------------
//        OrderingDishes a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"??????5",4000).thenReturn(true);
//            a2 = eatSystem.queryOrderingDishes(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryOrderingDishes2()  {
//
//        //????????????
//        //---------------------------------------------------
//        OrderingDishes a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = eatSystem.queryOrderingDishes(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyOrderingDishes()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.modifyOrderingDishes(100,"yucai");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyOrderingDishes2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.modifyOrderingDishes(1,"yucai");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteOrderingDishes()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.deleteOrderingDishes(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteOrderingDishes2()  {
//
//        //????????????
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"??????5",5000).thenReturn(true);
//            a2 = eatSystem.deleteOrderingDishes(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//}
