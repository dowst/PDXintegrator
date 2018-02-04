package org.jax.pdxintegrator.ncit;


import com.github.phenomics.ontolib.graph.data.ImmutableDirectedGraph;
import com.github.phenomics.ontolib.graph.data.ImmutableEdge;
import com.github.phenomics.ontolib.ontology.data.ImmutableOntology;
import com.github.phenomics.ontolib.ontology.data.TermId;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;

import java.util.Collection;
/**
 * Class for the {@link com.github.phenomics.ontolib.ontology.data.Ontology} based on
 * the National Cancer Institute's Thesaurus (NCIT).
 *
 * @author <a href="mailto:manuel.holtgrewe@bihealth.de">Manuel Holtgrewe</a>
 * @author <a href="mailto:peter.robinson@jax.org">Peter Robinson</a>
 * @version 0.1.1
 */
public class NcitOntology extends ImmutableOntology<NcitTerm,NcitTermRelation> {
    /** Serial UId for serialization. */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     *
     * @param metaInfo {@link ImmutableSortedMap} with meta information.
     * @param graph Graph with the ontology's topology.
     * @param rootTermId {@link TermId} of the root term.
     * @param nonObsoleteTermIds {@link Collection} of {@link TermId}s of non-obsolete terms.
     * @param obsoleteTermIds {@link Collection} of {@link TermId}s of obsolete terms.
     * @param termMap Mapping from {@link TermId} to MPO term.
     * @param relationMap Mapping from numeric edge identifier to {@link NcitTermRelation}.
     */
    public NcitOntology(ImmutableSortedMap<String, String> metaInfo,
                       ImmutableDirectedGraph<TermId, ImmutableEdge<TermId>> graph, TermId rootTermId,
                       Collection<TermId> nonObsoleteTermIds, Collection<TermId> obsoleteTermIds,
                       ImmutableMap<TermId, NcitTerm> termMap, ImmutableMap<Integer, NcitTermRelation> relationMap) {
        super(metaInfo, graph, rootTermId, nonObsoleteTermIds, obsoleteTermIds, termMap, relationMap);
    }

    @Override
    public String toString() {
        return "NcitOntology [getMetaInfo()=" + getMetaInfo() + ", getGraph()=" + getGraph()
                + ", getTermMap()=" + getTermMap() + ", getRelationMap()=" + getRelationMap()
                + ", getRootTermId()=" + getRootTermId() + ", getAllTermIds()=" + getAllTermIds()
                + ", getTerms()=" + getTerms() + ", getNonObsoleteTermIds()=" + getNonObsoleteTermIds()
                + ", getObsoleteTermIds()=" + getObsoleteTermIds() + "]";
    }

}