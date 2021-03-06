Model study module
==================

Tumors from PDX often undergo comprehensive genomic characterization and/or treatment in controlled dosing studies
to define therapeutic response and resistance. PDX-MI includes desirable fields in the reporting of these studies
that supplement existing guidelines for reporting on in vivo
biomedical research ( `Meehan et al., 2017 <https://www.ncbi.nlm.nih.gov/pubmed/29092942/>`_).


+------------------------------+-----+--------------------------------+------------------------------------------------+
| Field                        | Rec | Example                        |  PDXNet                                        |
+==============================+=====+================================+================================================+
| Treatment, passage           | D   |pertuzumab in  combination      |  ???????                                       |
|                              |     |with trastuzumab; CHEMBL2007641 |                                                |
+------------------------------+-----+--------------------------------+------------------------------------------------+
| Treatment    protocol        | D   |trastuzumab (30 mg/kg loading   |  ???????                                       |
|                              |     |dose, 15 mg/kg weekly);         |                                                |
+------------------------------+-----+--------------------------------+------------------------------------------------+
| Treatment    Response        | D   |                                | Terms as in quality assurance module           |
+------------------------------+-----+--------------------------------+------------------------------------------------+
| Tumor OMICs                  | D   |                                | SB team should define these specifications     |
+------------------------------+-----+--------------------------------+------------------------------------------------+
| Lag time/doubling time       | D   | 48h                            | separate elements                              |
+------------------------------+-----+--------------------------------+------------------------------------------------+
Table 2.5. Model study module. Rec: Recommendation; E: essential; D:desirable.


1. **Treatment, passage**
Treatment with medications will be recorded as in the clinical module.
Passages will be recorded using an enumeration P1, P2, ...
**Question** -- what is the meaning of passage? The start of treatment?

2. **Treatment protocol**
If there is a standard dosage scheme across all centers such as loading and maintenance doses,
then we can provide “slots” to capture this information as well as a corresponding RDF scheme.
--ToDo define what we want to capture.

3. **Treatment response**
complete    response,    partial    response,    stable    disease,    progressive
disease (Terms as in quality module). It is unclear what the distinction is between treatment response in this
module and in the quality module.


4. **Tumor    OMICS**:    TUMpdx-123;    subcutaneous;    90%    human;    exome    sequencing;
passage. Sample ID as above. Site as uberon or enumeration. Purity (need input as to how this is measured, but
possibly a percentage is adequate). The technology (exome etc) will be represented as an enumeration initially,
but it would be easy to map to other terminologies if desired. Passage will be an enumeration. The Seven Bridges
team should weigh in on how they need to map OMICs data.

5. **Development  of metastases in strain**
We will code this as Yes/no; site as uberon; passage as enumeration

6. **Lag time/doubling time of tumor**
We will code this as the number of hours.




