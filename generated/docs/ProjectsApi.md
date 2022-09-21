# ProjectsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProjects**](ProjectsApi.md#createProjects) | **POST** /api/projects | Create a project |



## createProjects

> createProjects(createProjectsRequest)

Create a project

### Example

```java
// Import classes:
import nl.project.webclient.ApiClient;
import nl.project.webclient.ApiException;
import nl.project.webclient.Configuration;
import nl.project.webclient.models.*;
import nl.project.webclient.api.ProjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        CreateProjectsRequest createProjectsRequest = new CreateProjectsRequest(); // CreateProjectsRequest | 
        try {
            apiInstance.createProjects(createProjectsRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#createProjects");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createProjectsRequest** | [**CreateProjectsRequest**](CreateProjectsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |

