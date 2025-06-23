Bir **RESTful Web Servis** örneğidir. Amaç, Spring Boot kullanarak REST API mantığını kavramaktır.

## 🚀 Kullanılan Teknolojiler

- Java 17+
- Spring Boot (Spring Web)
- Maven
- Postman (API test aracı)

## 📁 Proje Yapısı

src
└── main
└── java
└── com.ipeksavas
├── config
│ └── AppConfig.java
├── controller
│ └── RestEmployeeController.java
├── model
│ ├── Employee.java
│ └── UpdateEmployeeRequest.java
├── repository
│ └── EmployeeRepository.java (in-memory olarak çalışıyor)
├── services
│ └── EmployeeService.java
└── starter
└── SpringRestApiApplication.java


## ✅ Yapılanlar

- `Employee` adında bir sınıf oluşturuldu ve çalışan bilgileri bu sınıfta tutuldu.
- Veriler bir `List<Employee>` içinde bellekte saklanmaktadır.
- CRUD işlemleri için çeşitli HTTP endpoint’ler yazıldı.
- `EmployeeService` ile iş mantığı belirlendi.
- `RestEmployeeController` ile bu servisler dış dünyaya açıldı.
- **Postman** aracıyla tüm endpoint’ler test edilip yönetildi.

## 🔗 API Uç Noktaları

- `GET /rest/api/employee/list` → Tüm çalışanları listeler  
- `GET /rest/api/employee/list/{id}` → Belirli ID'ye ait çalışanı getirir  
- `POST /rest/api/employee/save` → Yeni çalışan ekler  
- `PUT /rest/api/employee/update/{id}` → ID'ye göre çalışanı günceller  
- `DELETE /rest/api/employee/delete/{id}` → ID'ye göre çalışanı siler  

## 🧪 Test Süreci

- API istekleri ve yanıtları **Postman** kullanılarak manuel olarak test edildi.
- Testlerde JSON formatı tercih edildi.

## ⚠️ Not

> Bu uygulama **veritabanı kullanmaz**. Veriler uygulama belleğinde tutulur, uygulama kapandığında kaybolur.

