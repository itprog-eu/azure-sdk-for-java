// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * SyncAgents.
 */
public final class SyncAgentsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private SyncAgentsService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of SyncAgentsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SyncAgentsInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(SyncAgentsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientSyncAgents to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientSyncAgents")
    private interface SyncAgentsService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/syncAgents/{syncAgentName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SyncAgentInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("syncAgentName") String syncAgentName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/syncAgents/{syncAgentName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("syncAgentName") String syncAgentName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") SyncAgentInner parameters);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/syncAgents/{syncAgentName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("syncAgentName") String syncAgentName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/syncAgents")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SyncAgentListResultInner>> listByServer(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/syncAgents/{syncAgentName}/generateKey")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SyncAgentKeyPropertiesInner>> generateKey(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("syncAgentName") String syncAgentName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/syncAgents/{syncAgentName}/linkedDatabases")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SyncAgentLinkedDatabaseListResultInner>> listLinkedDatabases(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("syncAgentName") String syncAgentName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/syncAgents/{syncAgentName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SyncAgentInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("syncAgentName") String syncAgentName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") SyncAgentInner parameters);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/syncAgents/{syncAgentName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("syncAgentName") String syncAgentName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SyncAgentListResultInner>> listByServerNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SyncAgentLinkedDatabaseListResultInner>> listLinkedDatabasesNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SyncAgentInner>> getWithResponseAsync(String resourceGroupName, String serverName, String syncAgentName) {
        final String apiVersion = "2015-05-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, serverName, syncAgentName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SyncAgentInner> getAsync(String resourceGroupName, String serverName, String syncAgentName) {
        return getWithResponseAsync(resourceGroupName, serverName, syncAgentName)
            .flatMap((SimpleResponse<SyncAgentInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncAgentInner get(String resourceGroupName, String serverName, String syncAgentName) {
        return getAsync(resourceGroupName, serverName, syncAgentName).block();
    }

    /**
     * Creates or updates a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String syncAgentName, String syncDatabaseId) {
        final String apiVersion = "2015-05-01-preview";
        SyncAgentInner parameters = new SyncAgentInner();
        parameters.withSyncDatabaseId(syncDatabaseId);
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, serverName, syncAgentName, this.client.getSubscriptionId(), apiVersion, parameters);
    }

    /**
     * Creates or updates a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SyncAgentInner> createOrUpdateAsync(String resourceGroupName, String serverName, String syncAgentName, String syncDatabaseId) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono = createOrUpdateWithResponseAsync(resourceGroupName, serverName, syncAgentName, syncDatabaseId);
        return this.client.<SyncAgentInner, SyncAgentInner>getLroResultAsync(mono, this.client.getHttpPipeline(), SyncAgentInner.class, SyncAgentInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncAgentInner createOrUpdate(String resourceGroupName, String serverName, String syncAgentName, String syncDatabaseId) {
        return createOrUpdateAsync(resourceGroupName, serverName, syncAgentName, syncDatabaseId).block();
    }

    /**
     * Deletes a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serverName, String syncAgentName) {
        final String apiVersion = "2015-05-01-preview";
        return service.delete(this.client.getHost(), resourceGroupName, serverName, syncAgentName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String serverName, String syncAgentName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono = deleteWithResponseAsync(resourceGroupName, serverName, syncAgentName);
        return this.client.<Void, Void>getLroResultAsync(mono, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serverName, String syncAgentName) {
        deleteAsync(resourceGroupName, serverName, syncAgentName).block();
    }

    /**
     * Lists sync agents in a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SyncAgentInner>> listByServerSinglePageAsync(String resourceGroupName, String serverName) {
        final String apiVersion = "2015-05-01-preview";
        return service.listByServer(this.client.getHost(), resourceGroupName, serverName, this.client.getSubscriptionId(), apiVersion)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null));
    }

    /**
     * Lists sync agents in a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SyncAgentInner> listByServerAsync(String resourceGroupName, String serverName) {
        return new PagedFlux<>(
            () -> listByServerSinglePageAsync(resourceGroupName, serverName),
            nextLink -> listByServerNextSinglePageAsync(nextLink));
    }

    /**
     * Lists sync agents in a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SyncAgentInner> listByServer(String resourceGroupName, String serverName) {
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName));
    }

    /**
     * Generates a sync agent key.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SyncAgentKeyPropertiesInner>> generateKeyWithResponseAsync(String resourceGroupName, String serverName, String syncAgentName) {
        final String apiVersion = "2015-05-01-preview";
        return service.generateKey(this.client.getHost(), resourceGroupName, serverName, syncAgentName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Generates a sync agent key.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SyncAgentKeyPropertiesInner> generateKeyAsync(String resourceGroupName, String serverName, String syncAgentName) {
        return generateKeyWithResponseAsync(resourceGroupName, serverName, syncAgentName)
            .flatMap((SimpleResponse<SyncAgentKeyPropertiesInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Generates a sync agent key.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncAgentKeyPropertiesInner generateKey(String resourceGroupName, String serverName, String syncAgentName) {
        return generateKeyAsync(resourceGroupName, serverName, syncAgentName).block();
    }

    /**
     * Lists databases linked to a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SyncAgentLinkedDatabaseInner>> listLinkedDatabasesSinglePageAsync(String resourceGroupName, String serverName, String syncAgentName) {
        final String apiVersion = "2015-05-01-preview";
        return service.listLinkedDatabases(this.client.getHost(), resourceGroupName, serverName, syncAgentName, this.client.getSubscriptionId(), apiVersion)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null));
    }

    /**
     * Lists databases linked to a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SyncAgentLinkedDatabaseInner> listLinkedDatabasesAsync(String resourceGroupName, String serverName, String syncAgentName) {
        return new PagedFlux<>(
            () -> listLinkedDatabasesSinglePageAsync(resourceGroupName, serverName, syncAgentName),
            nextLink -> listLinkedDatabasesNextSinglePageAsync(nextLink));
    }

    /**
     * Lists databases linked to a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SyncAgentLinkedDatabaseInner> listLinkedDatabases(String resourceGroupName, String serverName, String syncAgentName) {
        return new PagedIterable<>(listLinkedDatabasesAsync(resourceGroupName, serverName, syncAgentName));
    }

    /**
     * Creates or updates a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SyncAgentInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String syncAgentName, String syncDatabaseId) {
        final String apiVersion = "2015-05-01-preview";
        SyncAgentInner parameters = new SyncAgentInner();
        parameters.withSyncDatabaseId(syncDatabaseId);
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, serverName, syncAgentName, this.client.getSubscriptionId(), apiVersion, parameters);
    }

    /**
     * Creates or updates a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SyncAgentInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String syncAgentName, String syncDatabaseId) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, serverName, syncAgentName, syncDatabaseId)
            .flatMap((SimpleResponse<SyncAgentInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncAgentInner beginCreateOrUpdate(String resourceGroupName, String serverName, String syncAgentName, String syncDatabaseId) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, syncAgentName, syncDatabaseId).block();
    }

    /**
     * Deletes a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String serverName, String syncAgentName) {
        final String apiVersion = "2015-05-01-preview";
        return service.beginDelete(this.client.getHost(), resourceGroupName, serverName, syncAgentName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String serverName, String syncAgentName) {
        return beginDeleteWithResponseAsync(resourceGroupName, serverName, syncAgentName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a sync agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param syncAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String serverName, String syncAgentName) {
        beginDeleteAsync(resourceGroupName, serverName, syncAgentName).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SyncAgentInner>> listByServerNextSinglePageAsync(String nextLink) {
        return service.listByServerNext(nextLink)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SyncAgentLinkedDatabaseInner>> listLinkedDatabasesNextSinglePageAsync(String nextLink) {
        return service.listLinkedDatabasesNext(nextLink)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null));
    }
}
