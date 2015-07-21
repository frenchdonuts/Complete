package org.frenchy.onedonut.complete;

/**
 * Created by frenchdonuts on 7/21/15.
 */
public class ExploreIntents {
    /**
     * Inject ExploreFragment here
     * static final Observable goToTaskDetalFragment = ExploreFragment.onItemClick.
     *     map((Task task) -> ExporeAction.goToTaskDetailFragment);
     *
     * Or maybe we want to interpret a bunch of UI events happening together:
     * Rx.combineLatest(ExploreFragment.onItemClick,...).subscribe((Map<K,V> data) -> {
     *     ...
     * });
     * Hmmm...I whould only be passing actions, but we clearly need the task POJO to know which
     * task to display in the TaskDetailFragment.
     */

    /**
     * We could just establish an interface (of Observables) as a method of communication between
     * ExploreFragment --and--> ExploreIntents
     * The interface would simply establish which events ExploreFragment would expose to ExploreIntents.
     *
     * However, this is not completely reactive (according to Staltz at least); it is "halfway" reactive.
     * It would be fully reactive if ExploreIntents could query any Fragment (aka View) for any events
     * it wants. This way the locus of control is within ExploreIntents; ExploreIntents fully specifies
     * what it is reactive to internally.
     *
     * I mean, we could move the interface to be defined WITHIN ExploreIntents...
     *
     * This is true. I wonder if there is another way though...What I would really like to type in
     * ExploreIntents is something like this: ExploreFragment.get(R.id.viewId, "eventName"); and
     */

}
