# PetsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPets**](PetsApi.md#getPets) | **GET** /api/projects | get a pet



## getPets

> List&lt;PetResponse&gt; getPets()

get a pet

### Example

```java
// Import classes:
import nl.project.webclient.ApiClient;
import nl.project.webclient.ApiException;
import nl.project.webclient.Configuration;
import nl.project.webclient.models.*;
import nl.project.webclient.api.PetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PetsApi apiInstance = new PetsApi(defaultClient);
        try {
            List<PetResponse> result = apiInstance.getPets();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetsApi#getPets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;PetResponse&gt;**](PetResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succes respons |  -  |

