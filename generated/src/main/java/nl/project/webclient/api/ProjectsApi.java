package nl.project.webclient.api;

import nl.project.webclient.ApiClient;

import nl.project.webclient.model.InfraApiProjectCreate;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-21T09:00:30.331747600+02:00[Europe/Prague]")
public class ProjectsApi {
    private ApiClient apiClient;

    public ProjectsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProjectsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a project
     * 
     * <p><b>201</b> - OK
     * @param infraApiProjectCreate The infraApiProjectCreate parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createProjectsRequestCreation(InfraApiProjectCreate infraApiProjectCreate) throws WebClientResponseException {
        Object postBody = infraApiProjectCreate;
        // verify the required parameter 'infraApiProjectCreate' is set
        if (infraApiProjectCreate == null) {
            throw new WebClientResponseException("Missing the required parameter 'infraApiProjectCreate' when calling createProjects", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/projects", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a project
     * 
     * <p><b>201</b> - OK
     * @param infraApiProjectCreate The infraApiProjectCreate parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> createProjects(InfraApiProjectCreate infraApiProjectCreate) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return createProjectsRequestCreation(infraApiProjectCreate).bodyToMono(localVarReturnType);
    }

    /**
     * Create a project
     * 
     * <p><b>201</b> - OK
     * @param infraApiProjectCreate The infraApiProjectCreate parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> createProjectsWithHttpInfo(InfraApiProjectCreate infraApiProjectCreate) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return createProjectsRequestCreation(infraApiProjectCreate).toEntity(localVarReturnType);
    }

    /**
     * Create a project
     * 
     * <p><b>201</b> - OK
     * @param infraApiProjectCreate The infraApiProjectCreate parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createProjectsWithResponseSpec(InfraApiProjectCreate infraApiProjectCreate) throws WebClientResponseException {
        return createProjectsRequestCreation(infraApiProjectCreate);
    }
}
