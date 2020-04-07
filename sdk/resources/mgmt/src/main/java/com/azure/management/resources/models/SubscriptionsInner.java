// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Subscriptions. */
public final class SubscriptionsInner {
    /** The proxy service used to perform REST calls. */
    private final SubscriptionsService service;

    /** The service client containing this operation class. */
    private final SubscriptionClientImpl client;

    /**
     * Initializes an instance of SubscriptionsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SubscriptionsInner(SubscriptionClientImpl client) {
        this.service =
            RestProxy.create(SubscriptionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SubscriptionClientSubscriptions to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SubscriptionClientSu")
    private interface SubscriptionsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/locations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LocationListResultInner>> listLocations(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SubscriptionInner>> get(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SubscriptionListResultInner>> list(
            @HostParam("$host") String host, @QueryParam("api-version") String apiVersion, Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SubscriptionListResultInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * This operation provides all the locations that are available for resource providers; however, each resource
     * provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return location list operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<LocationInner>> listLocationsSinglePageAsync(String subscriptionId) {
        return FluxUtil
            .withContext(
                context ->
                    service.listLocations(this.client.getHost(), subscriptionId, this.client.getApiVersion(), context))
            .<PagedResponse<LocationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * This operation provides all the locations that are available for resource providers; however, each resource
     * provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return location list operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LocationInner> listLocationsAsync(String subscriptionId) {
        return new PagedFlux<>(() -> listLocationsSinglePageAsync(subscriptionId));
    }

    /**
     * This operation provides all the locations that are available for resource providers; however, each resource
     * provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return location list operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LocationInner> listLocations(String subscriptionId) {
        return new PagedIterable<>(listLocationsAsync(subscriptionId));
    }

    /**
     * Gets details about a specified subscription.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about a specified subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SubscriptionInner>> getWithResponseAsync(String subscriptionId) {
        return FluxUtil
            .withContext(
                context -> service.get(this.client.getHost(), subscriptionId, this.client.getApiVersion(), context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets details about a specified subscription.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about a specified subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SubscriptionInner> getAsync(String subscriptionId) {
        return getWithResponseAsync(subscriptionId)
            .flatMap(
                (SimpleResponse<SubscriptionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets details about a specified subscription.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about a specified subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SubscriptionInner get(String subscriptionId) {
        return getAsync(subscriptionId).block();
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscriptions for a tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SubscriptionInner>> listSinglePageAsync() {
        return FluxUtil
            .withContext(context -> service.list(this.client.getHost(), this.client.getApiVersion(), context))
            .<PagedResponse<SubscriptionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscriptions for a tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SubscriptionInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscriptions for a tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SubscriptionInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription list operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SubscriptionInner>> listNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<SubscriptionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}
